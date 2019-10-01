// Intended for use in the browser.

const n = +prompt('Enter a number to start with: ');

function collatz (n, iterations = 0) {
	if (n === 1) return iterations;
	return collatz(n & 1 ? (n * 3 + 1) : (n >> 2), iterations + 1);
}

alert(`There are ${collatz(n)} iterations in the collatz sequence for ${n}.`);
