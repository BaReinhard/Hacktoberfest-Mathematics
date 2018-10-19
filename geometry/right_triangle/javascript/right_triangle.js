// ES5

function hypotenuseLength(side1, side2){
  return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2))
}

function findMissingLength(side1, hypotenuse){
  return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side1, 2))
}

function sohcahtoa(adjacent, opposite, hypotenuse){  
  ans = []
  ans[0] = Math.sin(opposite/hypotenuse)
  ans[1] = Math.cos(adjacent/hypotenuse)
  ans[2] = Math.tan(opposite/adjacent)
  
  return ans
}

// ES6

let hypotenuseLength = (side1, side2) => Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2))

let findMissingLength = (side1, hypotenuse) => Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side1, 2))

let sohcatoa = (adjacent, opposite, hypotenuse) => {
  ans = []  
  ans[0] = Math.sin(opposite/hypotenuse)  
  ans[1] = Math.cos(adjacent/hypotenuse)  
  ans[2] = Math.tan(opposite/adjacent)
  
  return ans
}
