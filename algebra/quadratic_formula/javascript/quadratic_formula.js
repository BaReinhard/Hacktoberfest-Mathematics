function quadratic_formula(a, b, c) {
  const discriminant = b**2 - 4*a*c

  if (discriminant < 0) {
    return null
  } else {
    return [(-b + Math.sqrt(discriminant))/2*a, (-b - Math.sqrt(discriminant))/2*a]
  }
}
