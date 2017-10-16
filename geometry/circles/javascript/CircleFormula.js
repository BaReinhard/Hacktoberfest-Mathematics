// Returns 'true' if the point lies on the circle, else return 'false'
// ES5
function isPointOnCircle(centerX, centerY, radius, pointX, pointY){
  return Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2) - Math.pow(radius, 2) == 0
}
// ES6
let isPointOnCircle = (centerX, centerY, radius, pointX, pointY) => Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2) - Math.pow(radius, 2) == 0

// Gets radius of circle with the center coords and the coords of a point on the circle
// ES5
function getRadius(centerX, centerY, pointX, pointY){
  return Math.pow((Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2)), (1 / 2))
}
// ES6
let getRadius = (centerX, centerY, pointX, pointY) => Math.pow((Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2)), (1 / 2))

// Returns the length of arc given the angle in degrees and radius
// ES5
function arcLength(radius, angle){
  return angle * radius * Math.PI * (1 / 180)
}
// ES6
let arcLength = (radius, angle) => angle * radius * Math.PI * (1 / 180)