/**
 * Curried cross-product function.
 * Accepts the first 3-position array and returns a function which accepts the 
 * second 3-position array, which returns the cross product of the two. Note that
 * the order in which the arrays are passed in matters.
 * 
 */
var crossProduct = function(a) {
  var i1 = a[0],
    j1 = a[1],
    k1 = a[2];
  return function(b) {
    var i2 = b[0],
      j2 = b[1],
      k2 = b[2];
    return [j1 * k2 - k1 * j2, k1 * i2 - i1 * k2, i1 * j2 - j1 * i2];
  };
};
