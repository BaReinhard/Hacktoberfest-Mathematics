part of quadratic;

List<double> quadraticFunction(double a, double b, double c) {
  List<double> ans = new List<double>(2);
  ans[0] = -b + ( sqrt( pow(b,2) - (4*a*c) ) ) / (2*a);
  ans[1] = -b - ( sqrt( pow(b,2) - (4*a*c) ) ) / (2*a);
  return ans;
}
