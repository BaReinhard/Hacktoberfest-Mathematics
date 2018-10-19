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

var magnitude = function(vector) {
  return Math.sqrt(
    vector.reduce(function(memo, component) {
      return memo + component * component;
    }, 0)
  );
};

/**
 * Determine whether two vectors are parallel to each other.
 * @param {number[]} a the first vector
 * @returns {function(number[]):boolean} a function accepting the second vector.
 */
var areParallel = function(a) {
  return function(b) {
    return !magnitude(crossProduct(a)(b));
  };
};
