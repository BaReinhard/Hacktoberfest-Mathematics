/**
 * Compute the magnitude of a 2- or 3-dimensional vector.
 * @param {number[]} vector A 2- or 3-position array which represents a vector.
 */
var magnitude = function(vector) {
  return Math.sqrt(
    vector.reduce(function(memo, component) {
      return memo + component * component;
    }, 0)
  );
};
