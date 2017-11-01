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



// speedup version 

function sequence_product(s, e) {
    if (s > e) {
        throw 'Invalid Sequence: sequence start must be smaller or equal to sequence end';
    }
    var ret = s, cur = s + 1;
    while(cur <= e) {
        ret *= cur;
    }
    return ret;
}

function fast_combination(n, r) {
    var _r = ((n - r) > r) ? r - r : n;
    return sequence_product(n - r + 1, n) / sequence_product(1, n - r);
}