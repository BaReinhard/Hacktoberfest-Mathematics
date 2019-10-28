const area = function(base, height) {
    return (base*height)/2;
}

const angleArea = function(side1, side2, degrees) {
    return (side1*side2*Math.sin(degrees*Math.PI/180))/2
}

const heron = function(side1, side2, side3) {
    const s = (side1+side2+side3)/2
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))
}

module.exports = {
    area,
    angleArea,
    heron
}