// ES5

function factorial(n) {
    if (n === 0)
        return 1;
    else
        return n * factorial(n - 1);
}

function permutation(n, r) {
    return factorial(n) / factorial(n - r);
}

// ES6

let factorial = (n) => {
    if (n === 0)
        return 1;
    else
        return n * factorial(n - 1);
};

let permutation = (n, r) => factorial(n) / factorial(n - r);
