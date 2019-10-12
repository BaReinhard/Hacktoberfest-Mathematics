//You can calculate the area of a triangle if you know the lengths of all three sides, using a formula that has been known for nearly 2000 years.
function herons_formula(a, b, c) {
	const s = (a + b + c) / 2;
	const A = Math.sqrt(s * (s-a) * (s-b) * (s-c));

	return A;
}