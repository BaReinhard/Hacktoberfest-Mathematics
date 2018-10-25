/*
** initial - Initial Velocity
** final - Final Velocity
** time - Time taken in seconds
** returns acceleration in meter/second^2
*/
function accelerationCalculator (initial, final, time) {
  return (final - initial) / time
}

console.log(accelerationCalculator(48, 50, 2))
