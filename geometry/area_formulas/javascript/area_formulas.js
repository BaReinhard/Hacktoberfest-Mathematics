//
// ES6
const squareArea = (length) => {
  return Math.pow(length, 2);
}

const rectangleArea = (length, width) => {
  return length * width;
}

const triangleArea = (base, height) => {
  return (base*height) / 2;
}

const equilateralTriangleArea = (side) => {
  return Math.sqrt(3)/4 * Math.pow(side, 2);
}

const parallelogramArea = (base, height) => {
  return base*height;
}

const trapezoidArea = (base_one, base_two, height) => {
  return (base_one + base_two) * height / 2;
}

const circleArea = (radius) => {
  return Math.PI*(Math.pow(radius, 2));
}

const ellipseArea = (semi_major, semi_minor) => {
  return Math.PI*semi_major*semi_minor;
}
