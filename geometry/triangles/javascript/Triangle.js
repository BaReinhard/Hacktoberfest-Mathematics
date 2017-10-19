// ES5 way

function area(base, height) {
  return (base*height)/2;
}
 
function heron(side1, side2, side3) {
  var s = (side1+side2+side3)/2;
  return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}

// ES6 way

let area = (base, height) => (base*height)/2;
 
let heron = (side1, side2, side3) => { 
  let s = (side1+side2+side3)/2; 
  return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}