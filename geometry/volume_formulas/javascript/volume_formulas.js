// ES5 way

function cube_volume(edge_length) {
  return edge_length**3;
}

function cuboid_volume(width, length, height) {
  return width*length*height;
}

function cylinder_volume(radius, height) {
  return Math.PI*height*(radius**2);
}

function sphere_volume(radius) {
  return (4/3)*Math.PI*(radius**2);
}

function cone_volume(radius, height) {
  return (1/3)*Math.PI*height*(radius**2);
}

function ellipsoid_volume(r1,r2,r3) {
  return (4/3)*Math.PI*r1*r2*r3;
}

function pyramid_volume(width, length, height) {
  return (1/3)*width*length*height;
}

function hemisphere_volume(radius) {
  return (2/3)*Math.PI*(radius**2);
}

// ES6 way

let cube_volume = (edge_length) =>  edge_length**3;

let cuboid_volume = (width, length, height) =>  width*length*height;

let cylinder_volume = (radius, height) =>  Math.PI*height*(radius**2);

let sphere_volume = (radius) =>  (4/3)*Math.PI*(radius**2);

let cone_volume = (radius, height) =>  (1/3)*Math.PI*height*(radius**2);

let ellipsoid_volume = (r1,r2,r3) =>  (4/3)*Math.PI*r1*r2*r3;

let pyramid_volume = (width, length, height) =>  (1/3)*width*length*height;

let hemisphere_volume = (radius) =>  (2/3)*Math.PI*(radius**2);
