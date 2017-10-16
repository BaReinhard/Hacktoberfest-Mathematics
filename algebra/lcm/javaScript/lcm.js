// Euclidean GDC:
function gdc(a, b) {
	if (a === b) return a
  if (a === 0) return b
  if (b === 0) return a
  if (a > b) return gdc(a - b, b)
  return gdc(a, b - a)
}

// LCM using GDC:
function lcm (a, b) {
	if (a < 0 || b < 0 || a % 1 !== 0 || b % 1 !== 0) {
  	throw 'numbers must be non negative integers'
  }
  if (a === 0 && b === 0) return 0
  return (a * b) / gdc(a, b)
}

// EXAMPLE:
const a = 12
const b = 16
console.log(lcm(a, b))