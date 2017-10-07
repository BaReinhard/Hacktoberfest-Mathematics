var zip = function(ar1) {
  return function(ar2) {
    return ar1.map(function(val, index) {
      return [val, ar2[index]];
    });
  };
};

/**
 * Curried dotProduct function.
 * @param {number[]} a An arbitrary-length array which represents a vector.
 * @returns {function(number[]):number} a function accepting the second array.
 */
var dotProduct = function(a) {
  return function(b) {
    return zip(a)(b)
      .map(function(pair) {
        return pair[0] * pair[1];
      })
      .reduce(function(memo, val) {
        return memo + val;
      }, 0);
  };
};
