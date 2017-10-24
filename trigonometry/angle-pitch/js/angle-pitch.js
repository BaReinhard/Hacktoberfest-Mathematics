// N then R from nCr
// Example: N = 8 and R = 3
// Result: Value of 8C3 is 56
// Obs1: N must be greater or equal than R
// Obs2: The order of the selected items is not important
// Obs3: An item cannot be selected more than once

// ES5

function angleFromPitchEs5(rise, run) {
	if(Number.isInteger(rise) && Number.isInteger(run)) {
		var tan = parseFloat(rise/run);
		return tan * Math.PI / 180;
	}
	return false;
}

// ES6

let angleFromPitchEs6 = (rise, run) => {
	if(Number.isInteger(rise) && Number.isInteger(run)) {
		var tan = parseFloat(rise/run);
		return tan * Math.PI / 180;
	}
};