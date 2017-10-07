const magnitude = vector =>
  Math.sqrt(vector.reduce((memo, component) => memo + component ** 2, 0));

const zip = ar1 => ar2 => ar1.map((val, index) => [val, ar2[index]]);

const dotProduct = a => b =>
  zip(a)(b)
    .map(([c1, c2]) => c1 * c2)
    .reduce((memo, val) => memo + val, 0);

/**
 * Calculate theta, the angle between the two vectors.
 * @param {number[]} a the first vector
 * @returns {function(number[]):number} a function accepting the second array.
 */
const angleBetween = a => b =>
  Math.acos(dotProduct(a)(b) / (magnitude(a) * magnitude(b)));
