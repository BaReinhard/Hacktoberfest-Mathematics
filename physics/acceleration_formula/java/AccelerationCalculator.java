
/**
 * Acceleration is the rate of change of velocity with time.
 */
public class AccelerationCalculator {

	/**
	 * @param u - Initial Velocity in meter/second
	 * @param v - Final Velocity in meter/second
	 * @param t - Time taken in seconds
	 * @return acceleration in meters/second^2
	 */
	public static double calculateFor(double u, double v, double t) {
		return (v - u) / t;
	}
}
