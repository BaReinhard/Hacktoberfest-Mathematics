// ES5 way
function triangleAreaES5(a, b, c) {
  var halfPerimeter = ((a + b + c) / 2)

  return Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c))
}

// ES6 way
const triangleAreaES6 = (a, b, c) => {
  const halfPerimeter = ((a + b + c) / 2)

  return Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c))
}
