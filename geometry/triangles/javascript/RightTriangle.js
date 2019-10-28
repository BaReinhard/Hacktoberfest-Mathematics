
const hypotenuseLength = function(side1, side2) {
    return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
}
    
const findMissingLength = function(hypotenuse, side1) {
    return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side1, 2));
}

const socahtoa = function(adjacent, opposite, hypotenuse) {
    const a = []
    a.push(Math.sin(opposite/hypotenuse));
    a.push(Math.cos(adjacent/hypotenuse));
    a.push(Math.tan(opposite/adjacent));
    return a;
}

module.exports = {
    hypotenuseLength,
    findMissingLength,
    socahtoa
}
	
