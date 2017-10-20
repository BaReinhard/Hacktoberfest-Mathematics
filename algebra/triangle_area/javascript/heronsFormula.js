function triangleArea(a, b, c) {
  var S = ((a + b + c) / 2)
  
  var A = Math.sqrt(S*(S-a)*(S-b)*(S-c))

  return A
}
