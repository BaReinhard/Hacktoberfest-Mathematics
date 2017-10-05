// N then R from nCr
// Example: N = 8 and R = 3
// Result: Value of 8C3 is 56
// Obs1: N must be greater or equal than R
// Obs2: The order of the selected items is not important
// Obs3: An item cannot be selected more than once

// ES5

function factorial(n) {
    if (n === 0)
        return 1;
    else
        return n * factorial(n - 1);
}

function combination(n, r) {
    return factorial(n) / (factorial(r) * factorial(n - r));
}

// ES6

let factorial = (n) => {
    if (n === 0)
        return 1;
    else
        return n * factorial(n - 1);
};

let combination = (n, r) => factorial(n) / (factorial(r) * factorial(n - r));
