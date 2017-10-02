import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import http from 'axios';

class App extends Component {
    constructor() {
        super();
        this.state = {
            username: 'bareinhard',
            repo: 'hacktoberfest-mathematics',
            rootContent: [],
            rootDirectories: [],
            currentDirectory: [],
            displayCode: false,
            code: '',
            rootTree: [],
            codeContent: {},
        };
        this.loadFiles();
    }
    getRootFiles = async () => {
        let rootContent = await http
            .get(`https://api.github.com/repos/${this.state.username}/${this.state.repo}/contents/`)
            .then(res => res.data);
        let rootTree = [];
        for (let dir of rootContent) {
            if (dir.size === 0) {
                let treeObject = await http
                    .get(
                        `https://api.github.com/repos/${this.state.username}/${this.state
                            .repo}/git/trees/${dir.sha}?recursive=1`,
                    )
                    .then(res => res.data);
                treeObject.name = dir.name;
                treeObject.path = dir.path;
                rootTree.push(treeObject);
            }
        }
        let rootDirectories = rootContent.filter(file => file.size === 0);
        console.log(rootTree);

        this.setState({ rootContent, rootDirectories, rootTree });
    };
    loadFiles = async () => {
        this.getRootFiles('bareinhard', 'hacktoberfest-mathematics');
    };
    clickDirectory = event => {
        let path = event.target.className;
        http
            .get(`https://api.github.com/repos/${this.state.username}/${this.state.repo}/contents/${path}?ref=master`)
            .then(res => {
                let newRoot = res.data;
                console.log(newRoot);
                let codeContent = {};
                newRoot.forEach(rootDir =>
                    rootDir.tree.forEach(files => {
                        codeContent[files.path] = '';
                    }),
                );
                this.setState({ codeContent, currentDirectory: Array(...newRoot) });
            });
    };
    displayCode = async event => {
        let path = event.target.className;
        let res = await http.get(`${path}`).then(res => res.data);
        console.log(res);
        this.setState({
            code: atob(res.content),
            displayCode: true,
        });
    };
    filerSubDirectories = event => {
        let path = event.target.className;
        let currentDirectory = this.state.rootTree.filter(dir => dir.sha === path);
        console.log(currentDirectory);
        currentDirectory = currentDirectory[0].tree.filter(dir => !dir.path.includes('/'));
        this.setState({ currentDirectory });
    };
    loadCode = async event => {
        let path = event.target.className;
        let code = await http
            .get(`https://api.github.com/repos/${this.state.username}/${this.state.repo}/contents/${path}?ref=master`)
            .then(res => res.data);
        let newPath = path.split('/');
        let finalPath = '';
        for (let sub of newPath) {
            if (sub === newPath[1] && sub !== newPath[0]) {
                finalPath += sub;
            } else if (sub !== newPath[0]) {
                finalPath += '/' + sub;
            }
        }
        console.log(finalPath, this.state.codeContent);
        console.warn(Object.assign({}, { [finalPath]: atob(code.content) }, this.state.codeContent));
        this.setState({
            codeContent: Object.assign({}, { [finalPath]: atob(code.content) }, this.state.codeContent),
        });
    };
    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    <h1 className="App-title">Welcome to React</h1>
                </header>
                {this.state.rootTree.map(directory => (
                    <button onClick={this.filerSubDirectories} className={directory.sha} key={directory.sha}>
                        {directory.name}
                    </button>
                ))}
                <ol>
                    {this.state.currentDirectory.map(
                        dir =>
                            !dir.path.includes('/') ? (
                                <a key={dir.sha} href={`#${dir.path}`}>
                                    <li>{dir.path}</li>
                                </a>
                            ) : (
                                ''
                            ),
                    )}
                </ol>
                <div>
                    {this.state.rootTree.map(dir => (
                        <div key={dir.path} className="content">
                            <h3>{dir.name}</h3>
                            {dir.tree.map(subdir => {
                                let subs = [];

                                return !subdir.path.includes('/') ? (
                                    <div key={`${dir.path}/toplevel${subdir.path}`} className="sub-content">
                                        <h4 id={subdir.path}>{subdir.path}</h4>
                                        {dir.tree.map(subsubdir => {
                                            let subName = subsubdir.path.split('/');

                                            if (
                                                subsubdir.path.includes('/') &&
                                                subName[0] === subdir.path &&
                                                !subs.includes(subName[1])
                                            ) {
                                                console.log(subName, !subs.includes(subName), subs);
                                                subs.push(subName[1]);
                                                return (
                                                    <div key={`${dir.path}/${subName[1]}`}>
                                                        <h5>{subsubdir.path.split('/')[1]}</h5>
                                                        {dir.tree.map(
                                                            files =>
                                                                files.path.includes(subName[0] + '/' + subName[1]) &&
                                                                files.path.includes('.') ? (
                                                                    <div key={`${dir.path}/${files.path}`}>
                                                                        <h4>
                                                                            {
                                                                                files.path.split('/')[
                                                                                    files.path.split('/').length - 1
                                                                                ]
                                                                            }
                                                                        </h4>
                                                                        <button
                                                                            className={`${dir.path}/${files.path}`}
                                                                            onClick={this.loadCode}
                                                                        >
                                                                            View Code
                                                                        </button>
                                                                        <div style={{ textAlign: 'left' }}>
                                                                            <pre>
                                                                                {this.state.codeContent[files.path]}
                                                                            </pre>
                                                                        </div>
                                                                    </div>
                                                                ) : (
                                                                    ''
                                                                ),
                                                        )}
                                                    </div>
                                                );
                                            } else {
                                                return '';
                                            }
                                        })}
                                    </div>
                                ) : (
                                    ''
                                );
                            })}
                        </div>
                    ))}
                </div>

                {/* Display Code*/}
            </div>
        );
    }
}

export default App;
