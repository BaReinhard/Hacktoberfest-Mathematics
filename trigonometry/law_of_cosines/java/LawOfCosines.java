
/** Utility methods using the law of cosines. */
public class LawOfCosines {
	/**
	 * Calculates a side length of a triangle given two side lengths and the associated angle.
	 * @param sideA side length of side A of a triangle
	 * @param sideB side length of side B of a triangle
	 * @param angleC angle measure C of a triangle in degrees
	 * @return length of the missing side in the same units as a and b
	 */
	public static double getSideLength(double sideA, double sideB, double angleC) {
		return Math.sqrt((Math.pow(sideA, 2)) + Math.pow(sideB, 2) 
			+ (2 * sideA * sideB * Math.cos(Math.toRadians(angleC))));
	}
	
	/**
	 * Calculates an angle of a triangle given three side lengths
	 * @param sideA the length of one side of a triangle
	 * @param sideB the length of another side of a triangle
	 * @param sideC the length of a third side of a triangle
	 * @return the angle associated with side A in degrees
	 */
	public static double getAngleMeasure(double sideA, double sideB, double sideC) {
		return Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
	}
}
