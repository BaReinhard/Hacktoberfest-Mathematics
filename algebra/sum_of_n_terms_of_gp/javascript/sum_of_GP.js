// ES5 way

function sum_of_gp(n, r, a) {
  return (a*(1-Math.pow(r,n)))/(1-r);
}

// ES6 way

let sum_of_gp = (n, r, a) => (a*(1-Math.pow(r,n)))/(1-r);