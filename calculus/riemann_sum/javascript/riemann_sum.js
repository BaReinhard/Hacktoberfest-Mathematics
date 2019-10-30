function left(f, a, b, n) {
  let total = 0;
  const dx = (b - a) / n;
  
  for (let i = 0; i < n - 1; i++) {
    xi = a + (i * dx);
    total += f(xi);
  }

  return total * dx;
}

function right(f, a, b, n) {
  let total = 0;
  const dx = (b - a) / n;
  
  for (let i = 0; i < n - 1; i++) {
    xi = a + ((i + 1) * dx);
    total += f(xi);
  }

  return total * dx;
}

function trapezoidal(f, a, b, n) {
  let total = 0;
  const dx = (b - a) / n;
  
  for (let i = 0; i < n - 1; i++) {
    xi1 = a + (i * dx);
    xi2 = a + ((i + 1) * dx);
    total += (f(xi1) + f(xi2)) / 2;
  }

  return total * dx;
}

function midpoint(f, a, b, n) {
  let total = 0;
  const dx = (b - a) / n;
  
  for (let i = 0; i < n - 1; i++) {
    xi1 = a + (i * dx);
    xi2 = a + ((i + 1) * dx);
    total += f((xi1 + xi2) / 2);
  }

  return total * dx;
}
