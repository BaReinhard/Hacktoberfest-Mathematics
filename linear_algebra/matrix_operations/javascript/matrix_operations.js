/**
 * @summary Implementation of addition of matrices by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Matrix} A Matrix mxn
 * @param {Matrix} B Matrix mxn
 * @returns {Matrix} C Matrix mxn
 */
function add_matrix(A, B) {
  if (A.length != B.length || A[0].length != B[0].length) {
      throw new RangeError('A + B | A and B must have the same # of rows and columns!');
  }

  var C = new Array(A.length);
  for (var i = 0; i < A.length; i++) {
    C[i] = new Array(A[0].length);
    for (var j = 0; j < A[0].length; j++) {
      C[i][j] = A[i][j] + B[i][j];
    }
  }
  return C;
}

/**
 * @summary Implementation of multiplication of matrices by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Matrix} A Matrix mxn
 * @param {Matrix} B Matrix nxp
 * @returns {Matrix} C Matrix mxp
 */
function multiply_matrix(A, B) {
  if (A[0].length != B.length) {
      throw new RangeError('A * B | The #columns of A must be equal to the #rows of B!');
  }

  var C = new Array(A.length);
  for (var i = 0; i < A.length; i++) {
    C[i] = new Array(B[0].length);
    for (var j = 0; j < B[0].length; j++) {
      C[i][j] = 0;
      for (var k = 0; k < B.length; k++) {
        C[i][j] += A[i][k] * B[k][j];
      }
    }
  }
  return C;
}

/**
 * @summary Implementation of multiplication of a matrix by a scalar of matrix by using ES5
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Matrix} A Matrix mxn
 * @param {Number} k Number
 * @returns {Matrix} C Matrix mxn
 */
function multiply_scalar(A, k) {
  var C = new Array(A.length);
  for (var i = 0; i < A.length; i++) {
    C[i] = new Array(A[0].length);
    for (var j = 0; j < A[0].length; j++) {
      C[i][j] = A[i][j] * k;
    }
  }
  return C;
}

/**
 * @summary Implementation of addition of matrices by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Matrix} A Matrix mxn
 * @param {Matrix} B Matrix mxn
 * @returns {Matrix} C Matrix mxn
 */
const add_matrix = (A, B) => {
  if (A.length != B.length || A[0].length != B[0].length) {
      throw new RangeError('A + B | A and B must have the same # of rows and columns!');
  }

  let C = new Array(A.length);
  for (let i = 0; i < A.length; i++) {
    C[i] = new Array(A[0].length);
    for (let j = 0; j < A[0].length; j++) {
      C[i][j] = A[i][j] + B[i][j];
    }
  }
  return C;
}

/**
 * @summary Implementation of multiplication of matrices by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Matrix} A Matrix mxn
 * @param {Matrix} B Matrix nxp
 * @returns {Matrix} C Matrix mxp
 */
const multiply_matrix = (A, B) => {
  if (A[0].length != B.length) {
      throw new RangeError('A * B | The #columns of A must be equal to the #rows of B!');
  }

  let C = new Array(A.length);
  for (let i = 0; i < A.length; i++) {
    C[i] = new Array(B[0].length);
    for (let j = 0; j < B[0].length; j++) {
      C[i][j] = 0;
      for (let k = 0; k < B.length; k++) {
        C[i][j] += A[i][k] * B[k][j];
      }
    }
  }
  return C;
}

/**
 * @summary Implementation of multiplication of a matrix by a scalar of matrix by using ES6
 * @author João Vicente Souto <joaovicentesouto@gmail.com>
 * @param {Matrix} A Matrix mxn
 * @param {Number} k Number
 * @returns {Matrix} C Matrix mxn
 */
const multiply_scalar = (A, k) => {
  let C = new Array(A.length);
  for (let i = 0; i < A.length; i++) {
    C[i] = new Array(A[0].length);
    for (let j = 0; j < A[0].length; j++) {
      C[i][j] = A[i][j] * k;
    }
  }
  return C;
}
