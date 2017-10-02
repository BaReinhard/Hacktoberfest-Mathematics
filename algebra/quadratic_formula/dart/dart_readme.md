# Getting Dart and running the code

1.) Make sure that you have brew! If not, check out the _`Brew Guide`_

2.) To get started install dart with the following command!

```bash
~$ brew install dart --with-contentshell --with-dartium
```

3.) If it's giving you trouble with linking (You may already have another version of dart) you can do this and then run step 2 again.

```bash
~$ brew unlink dart
```

4.) then navigate to dart directory and run the `pub get` command:

```bash
dart$ pub get
```

5.) Now you are ready to run the demo code! To do so, simply execute the `pub run` command with the main filename:

```bash
dart$ pub run main.dart
```

Voila! The code should run!