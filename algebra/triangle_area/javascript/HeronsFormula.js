function area(a, b, c) {
  var triangleArea = getArea(a, b, c); // call getArea function to compute the area
  return Number(triangleArea.toFixed(2)); // return area approximated to 2 decimal places
}

function getArea(a, b, c) {
  var s = (a + b + c) / 2; // calculate the semi-perimeter
  return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // return triangle area using Heron's Formula
}
