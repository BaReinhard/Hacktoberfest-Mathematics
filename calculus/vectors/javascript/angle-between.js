var magnitude = function(vector) {
  return Math.sqrt(
    vector.reduce(function(memo, component) {
      return memo + component * component;
    }, 0)
  );
};

var zip = function(ar1) {
  return function(ar2) {
    return ar1.map(function(val, index) {
      return [val, ar2[index]];
    });
  };
};

var dotProduct = function(a) {
  return function(b) {
    return zip(a)(b)
      .map(function(pair) {
        return pair[0] * pair[0];
      })
      .reduce(function(memo, val) {
        return memo + val;
      }, 0);
  };
};

/**
 * Calculate theta, the angle between the two vectors.
 * @param {number[]} a the first vector
 * @returns {function(number[]):number} a function accepting the second array.
 */
var angleBetween = function(a) {
  return function(b) {
    return Math.acos(dotProduct(a)(b) / (magnitude(a) * magnitude(b)));
  };
};
