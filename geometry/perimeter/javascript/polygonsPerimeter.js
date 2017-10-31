// Find perimeter of a Circle
// ES5
function circlePerimeter(radius){
  return 2 * Math.PI * radius
}
// ES6
let circlePerimeter = (radius) => 2 * Math.PI * radius

// Find perimeter of a Square
// ES5
function squarePerimeter(side){
  return side * 4
}
// ES6
let squarePerimeter = (side) => side * 4

// Find perimeter of a Rectangle
//ES5
function rectanglePerimeter(length, base){
  return 2 * (length + base)
}
// ES6
let rectanglePerimeter = (length, base) =>  2 * (length + base)

// Find perimeter of a Triangle
// ES5
function trianglePerimeter(side1, side2, side3){
  return side1 + side2 + side3
}
// ES6
let trianglePerimeter = (side1, side2, side3) => side1 + side2 + side3

// Find perimeter of a Parallelogram
// ES5
function parallelogramPerimeter(side1, side2, side3, side4){
  return side1 + side2 + side3 + side4
}
// ES6
let parallelogramPerimeter = (side1, side2, side3) => side1 + side2 + side3 + side4

// Find perimeter of a Trapezoid
// ES5
function trapezoidPerimeter(height, base1, base2){
  return height * ((base1 + base2) / 2)
}
// ES6
let trapezoidPerimeter = (height, base1, base2) => height * ((base1 + base2) / 2)