// For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
// with a being the initial term and d being the common difference

// This function calculates the nth term
function nth_term(a, d, n){
	return  a + (n - 1) * d;
}
