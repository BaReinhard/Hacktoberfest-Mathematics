
/// Function to calculate the force given the mass and acceleration of an object.
double forceEquation(double mass, double acceleration) {
  double force = mass * acceleration;
  return force;
}

main() {
  // Demo:
  double force = forceEquation(20.0, 15.0);
  print('force for an object with mass of 20.0, and an acceleration of 15.0 = $force');
}
