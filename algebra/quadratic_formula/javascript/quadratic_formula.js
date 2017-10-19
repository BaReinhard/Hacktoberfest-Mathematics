// ES5 way

function quadratic_formula(a, b, c) {
  
  var discrimiant = b**2 - (4 * a * c);
  if (discrimiant < 0) {
    return "This equation does not have a real solution";
  }
  else if (discrimiant === 0) {
    return (-b + Math.sqrt(discrimiant)) / 2 * a;
  }
  else {
    var answers = {};
    answers["solution_one"] = (-b + Math.sqrt(discrimiant)) / (2 * a);
    answers["solution_two"] = (-b - Math.sqrt(discrimiant)) / (2 * a);
    return answers;
  }
}

// ES6 way

let quadratic_formula = (a, b, c) => {
  
  let discrimiant = b**2 - (4 * a * c);
  if (discrimiant < 0) {
    return "This equation does not have a real solution";
  }
  else if (discrimiant === 0) {
    return (-b + Math.sqrt(discrimiant)) / 2 * a;
  }
  else {
    let answers = {};
    answers["solution_one"] = (-b + Math.sqrt(discrimiant)) / (2 * a);
    answers["solution_two"] = (-b - Math.sqrt(discrimiant)) / (2 * a);
    return answers;
  }
}