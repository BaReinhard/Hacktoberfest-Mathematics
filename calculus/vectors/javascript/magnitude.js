/**
 * Compute the magnitude of a 2- or 3-dimensional vector.
 * @param {number[]} vector A 2- or 3-position array which represents a vector.
 */
const magnitude = vector =>
  Math.sqrt(vector.reduce((memo, component) => memo + component ** 2, 0));
