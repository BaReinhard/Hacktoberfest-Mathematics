/**
 * @summary Implementation of vector length by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Array} v Vector
 * @returns {Number} Length vector
 */
function vector_length(v) {
  var squares = v.reduce(function(acc, value) {
    return acc + Math.pow(value, 2);
  }, 0);

  return Math.sqrt(squares);
}

/**
 * @summary Implementation of sum of vectors by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Array} v Vector
 * @param {Array} w Vector
 * @returns {Array} v + w
 */
function vector_sum(v, w) {
  if (v.length != w.length)
    throw new RangeError('The dimensions of v and w dont match');

  return v.map(function(vi, i){
    return vi + w[i];
  });
}

/**
 * @summary Implementation of product of vectors by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Array} v Vector
 * @param {Array} w Vector
 * @returns {Array} v * w
 */
function dotProduct(v, w) {
  if (v.length != w.length)
    throw new RangeError('The dimensions of v and w dont match');

  return v.reduce(function(acc, vi, i) {
    return acc + vi * w[i];
  }, 0);
}

/**
 * @summary Implementation of vector length by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Array} v Vector
 * @returns {Number} Length vector
 */
const vector_length = (v) => {
  return Math.sqrt(v.reduce((acc, value) => acc + Math.pow(value, 2), 0));
}

/**
 * @summary Implementation of sum of vectors by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Array} v Vector
 * @param {Array} w Vector
 * @returns {Array} v + w Vector
 */
const vector_sum = (v, w) => {
  if (v.length != w.length)
    throw new RangeError('The dimensions of v and w dont match');

  return v.map((vi, i) => vi + w[i]);
}

/**
 * @summary Implementation of product of vectors by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Array} v Vector
 * @param {Array} w Vector
 * @returns {Array} v * w
 */
const dotProduct = (v, w) => {
  if (v.length != w.length)
    throw new RangeError('The dimensions of v and w dont match');

  return v.reduce((acc, vi, i) => acc + vi * w[i], 0);
}
