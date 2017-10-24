/***
Adds two matrices `a` and `b`
***/
const add = function(a,b) {
    if (a.length !== b.length || a[0].length !== b[0].length) {
      throw Error("Matrices must be of same length.");
    }
    return a.map((line, i) => line.map((el, j) => el + b[i][j]));
}

/***
Performs a dot-multiplication of two vectors `a`, and `b`
***/
const dot_multiply = function (a,b) {
  if (a.length !== b.length) {
    throw Error("Vectors must be of same length");
  }
  return a.map((el, i) => el * b[i]).reduce((acc, el) => acc + el);
}

/***
Performs a matrix multiplication between matrices `a` and `b`
***/
const multiply = function(a,b) {
  if (b.length !== a[0].length) {
    throw Error("Matrices must be of sizes [x,y] and [y,z]")
  }
  return a.map((line) => line.map((_,i) => dot_multiply(line, b.map((col) => col[i]))));
}

/***
Multiplies matrix `a` by an scalar `x`
***/
const multiply_scalar = function(a,x) {
  return a.map((line) =>  line.map(el => x * el));
}

/***
Transposes matrix `a`
***/
const transpose = function(a) {
  return a.map((line,i) => line.map((_,j) => a[j][i]));
}


module.exports = {add, dot_multiply, multiply, multiply_scalar, transpose}
