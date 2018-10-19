// For a geometric progression a + ar + ar^2 + ar^3 + ...
// with a being the scale factor and r being the common ratio

// This function calculates the nth term
function nth_term(a, r, n){
	return  a * Math.pow(r, n - 1);
}

// This function calculates the sum of the first n terms
function sum_of_first_n(a, r, n){
	return (a * (1-Math.pow(r,n))) / (1 - r);
}
