
/**
 * Acceleration is the rate of change of velocity with time.
 */
public class AccelerationCalculator {

	/**
	 * @param u - Initial Velocity in meter/second
	 * @param v - Final Velocity in meter/second
	 * @param t - Time taken in seconds
	 * @return acceleration in meter/second^2
	 */
	public static double calculateAcceleration(double u, double v, double t) {
		return (v - u) / t;
	}

	/**
	 *
	 * @param u - Initial Velocity in meter/second
	 * @param v - Final Velocity in meter/second
	 * @param s - Displacement in meters
	 * @return Acceleration in meter/second ^ 2
	 */

	public static double calculateAcceleration(double u, double v, float s) {
		return ((Math.pow(u, 2) - Math.pow(v, 2)) / (2 * s)); // Derived from the u^2 = v^2 + 2ad formula.
	}


}