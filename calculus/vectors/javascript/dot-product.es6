const zip = ar1 => ar2 => ar1.map((val, index) => [val, ar2[index]]);

/**
 * Curried dotProduct function.
 * @param {number[]} a An arbitrary-length array which represents a vector.
 * @returns {function(number[]):number} a function accepting the second array.
 */
const dotProduct = a => b =>
  zip(a)(b)
    .map(([c1, c2]) => c1 * c2)
    .reduce((memo, val) => memo + val, 0);
