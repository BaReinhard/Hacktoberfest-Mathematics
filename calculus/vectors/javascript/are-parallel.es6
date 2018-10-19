const crossProduct = ([i1, j1, k2]) => ([i2, j2, k3]) => [
  j1 * k3 - k2 * j2,
  k2 * i2 - i1 * k3,
  i1 * j2 - j1 * i2
];
const magnitude = vector =>
  Math.sqrt(vector.reduce((memo, component) => memo + component ** 2, 0));

/**
 * Determine whether two vectors are parallel to each other.
 * @param {number[]} a the first vector
 * @returns {function(number[]):boolean} a function accepting the second vector.
 */
const areParallel = a => b => !magnitude(crossProduct(a)(b));
