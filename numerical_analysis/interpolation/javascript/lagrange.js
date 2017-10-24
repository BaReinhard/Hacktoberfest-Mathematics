/**
 * @summary Implementation of lagrange by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {number} target x expected to get f(x)
 * @param {Array} xs x's of the interval [a, b]
 * @param {Array} ys f(x) for each x in the interval [a, b]
 * @returns {number} Approximation of f(target)
 */
function lagrange(target, xs, ys) {
  var solution = 0;

  for (var i = 0; i < xs.length; i++) {
    var up = 1;
    var down = 1;

    for (var j = 0; j < ys.length; j++) {
      if (i != j) {
        up = up * (target - xs[j]);
        down = down * (xs[i] - xs[j]);
      }
    }
    solution = solution + ys[i] * (up/down);
  }

  return solution;
}

/**
 * @summary Implementation of lagrange by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {number} target x expected to get f(x)
 * @param {Array} xs x's of the interval [a, b]
 * @param {Array} ys f(x) for each x in the interval [a, b]
 * @returns {number} Approximation of f(target)
 */
const lagrange = (target, xs, ys) => {
  let solution = 0;

  for (let i = 0; i < xs.length; i++) {
    let up = 1;
    let down = 1;

    for (let j = 0; j < ys.length; j++) {
      if (i != j) {
        up = up * (target - xs[j]);
        down = down * (xs[i] - xs[j]);
      }
    }
    solution = solution + ys[i] * (up/down);
  }

  return solution;
}
