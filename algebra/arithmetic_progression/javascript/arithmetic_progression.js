// For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
// with a being the initial term and d being the common difference

// This function calculates the nth term
function nth_term(a, d, n){
	return  a + (n - 1) * d;
}

// This function calculates the sum of the first n terms
function sum_of_first_n(a, d, n){
	return n / 2 * (2 * a + (n - 1) * d);
}