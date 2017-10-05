
/**
* Acceleration is the rate of change of velocity with time.
*/
public class AccelerationCalculator {
	
	/**
	* u - Initial Velocity in meter/second
	* v - Final Velocity in meter/second
	* t - Time taken in seconds
	*
	* returns acceleration in meter/second^2
	*/
	public static double calculateFor(double u, double v, double t) {
		return (v - u) / t;
	}
}