/**
 * @summary Implementation of Ackermann formula by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Number} m ∈ ℤ⁺
 * @param {Number} n ∈ ℤ⁺
 * @returns {Number} result
 */
function ackermann(m, n) {
  if (m == 0)
    return n+1;
  else if (m > 0 && n == 0)
    return ackermann(m-1, 1);
  else
    return ackermann(m-1, ackermann(m, n-1));
}

/**
 * @summary Implementation of Ackermann formula by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Number} m ∈ ℤ⁺
 * @param {Number} n ∈ ℤ⁺
 * @returns {Number} result
 */
const ackermann = (m, n) =>
  m == 0 ?          n+1 :
  m > 0 && n == 0 ? ackermann(m-1, 1) :
                    ackermann(m-1, ackermann(m, n-1))
