// ES5 way

function arc_angle(arc_len, radius) {
  return (360*arc_len)/(Math.PI*2*radius);
}

// ES6 way

let arc_angle = (arc_len, radius) => (360*arc_len)/(Math.PI*2*radius);