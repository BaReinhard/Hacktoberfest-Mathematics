function triangle_area(base, height) {
  return 0.5 * base * height;
}

function square_area(edge_len) {
  return edge_len ** 2;
}

function rectangle(width, length) {
  return width * length;
}

function ellipse(a, b) {
  return Math.PI * a * b;
}

function trapezoid(base_one, base_two, height) {
  return 0.5 * (base_one + base_two) * height;
}

function circle(radius) {
  return Math.PI * (radius ** 2);
}

function cylinder(radius, height) {
  return 2 * Math.PI * radius * height;
}

function sphere(radius) {
  return 4 * Math.PI * (radius ** 2);
}

function sector(radius, angle) {
  return 0.5 * angle * (radius ** 2);
}
