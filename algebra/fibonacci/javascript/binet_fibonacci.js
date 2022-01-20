// This function calculates 'n' fibonacci using Binet's formula
function fibonacci(n) {
	const SQRT_5 = Math.sqrt(5);
	const PHI = (1 + SQRT_5) / 2;
	const binet = ((Math.pow(PHI, n) - Math.pow((-1) / PHI, n)) / SQRT_5);
	return Math.ceil(binet);
}
