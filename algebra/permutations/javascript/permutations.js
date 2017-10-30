// factorial

const factorial = n => n === 0 ? 1 : n * factorial(n - 1);

// permutations

const permutations = (n, k) => factorial(n) / factorial(n - k);
