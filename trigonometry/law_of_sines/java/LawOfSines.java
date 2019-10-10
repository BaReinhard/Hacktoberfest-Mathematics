import static java.lang.Math.sin;
import static java.lang.Math.asin;
import static java.lang.Math.toRadians;

import java.util.Arrays;

/** Utility methods using the Law of Sines. */
public class LawOfSines {
	/**
	 * Finds a side length of a triangle given another side length and two angles.
	 * @param angleA the angle corresponding to the side length desired in degrees.
	 * @param angleB the angle corresponding to another side length in degrees
	 * @param sideB a side length of a triangle corresponding to angleB
	 * @return the side length of the segment corresponding to angleA (sideA)
	 */
	public static double getSide(double angleA, double angleB, double sideB) {
		return (sideB * sin(toRadians(angleA))) / sin(toRadians(angleB));
	}
	
	/**
	 * Finds a missing angle of a triangle given two other sides and an angle.
	 * Accomodates for two, one, or zero potential triangles.
	 * @param sideA a length of one side of a triangle
	 * @param angleA an angle measure of the angle corresponding to sideA in degrees
	 * @param sideB a length of another side of a triangle
	 * @return the angle corresponding to sideB (angleB)
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Object> T getAngle(double sideA, double angleA, double sideB) {
		double height = sideB * sin(toRadians(angleA));
		double calcAngleB = asin((sideB * sin(toRadians(angleA))) / sideA);
		System.out.println();
		if (sideA > sideB) { 
			//one solution case
			return (T) Double.valueOf(calcAngleB);
		} else if (sideA > height) {
			//two solutions case
			return (T) Arrays.asList(calcAngleB, 180 - calcAngleB);
		} else {
			//no solution case
			return (T) "No triangle can be formed";
		}
	}
}
