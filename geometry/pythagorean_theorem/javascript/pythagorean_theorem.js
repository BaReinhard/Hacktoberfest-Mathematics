module.exports = {
  findHypotenuse(size1, size2){
    return Math.sqrt(Math.pow(size1, 2) + Math.pow(size2, 2));
  },
  findSize (size, hypotenuse){
    return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(size, 2));
  }
}