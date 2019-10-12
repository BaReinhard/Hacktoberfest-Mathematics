import static java.lang.Math.sin;
import static java.lang.Math.asin;
import static java.lang.Math.toRadians;

import java.text.DecimalFormat;

import static java.lang.Math.toDegrees;

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
		if (angleA <= 0 || angleA >= 180) { throw new IllegalArgumentException("Invalid angle value recieved"); }
		double height = sideB * sin(toRadians(angleA));
		double calcAngleB = Double.valueOf(new DecimalFormat("#.####").format(toDegrees(asin(height / sideA))));
		return (T) ((sideA > sideB) ? Double.valueOf(calcAngleB) //one solution
				: (sideA > height) ? Arrays.asList(calcAngleB, 180 - calcAngleB)  //two solutions
				: "No triangle can be formed"); //no solutions
	}
}
