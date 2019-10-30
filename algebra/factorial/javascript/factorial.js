// ES5

function factorial(n) {
	var result = 1;
	
	for(var i = 1; i <= n; i++){
		result = result * i;
	}

	return result;
}

// ES6

let factorial = (n) => {
	let result = 1;
	
	for(let i = 1; i <= n; i++){
		result = result * i;
	}

	return result;
}