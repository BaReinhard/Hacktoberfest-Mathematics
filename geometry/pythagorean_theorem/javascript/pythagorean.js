module.exports = function(a,b) {
  var out_a = a * a;
  var out_b = b * b;
  var result = Math.sqrt(out_a + out_b);
  return {given:[a,b], s2:{ a: out_a, b: out_b }, result}
}