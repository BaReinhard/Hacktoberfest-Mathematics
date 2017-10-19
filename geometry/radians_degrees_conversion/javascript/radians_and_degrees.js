// ES5 way

function radians_to_degrees(radians){
  return radians*(180/Math.PI);
}

function degrees_to_radians(degrees){
  return degrees*(Math.PI/180);
}

// ES6 way

let radians_to_degrees = (radians) => radians*(180/Math.PI);

let degrees_to_radians = (degrees) => degrees*(Math.PI/180);
