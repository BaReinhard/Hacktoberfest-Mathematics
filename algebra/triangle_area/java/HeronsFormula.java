/**
 * 
 */
package herons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculates the area of a triangle by using Heron's formula.
 * 
 * @author shivanishirolkar
 *
 */
public class HeronsFormula {

	/**
	 * Interacts with the user.
	 * 
	 * @param args
	 *            Command line argument (not used)
	 * @throws IOException
	 *             if there is an error in input/output
	 */
	public static void main(String args[]) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter side1:");
			double userInput1 = Double.parseDouble(br.readLine());
			System.out.print("Enter side2:");
			double userInput2 = Double.parseDouble(br.readLine());
			System.out.print("Enter side3:");
			double userInput3 = Double.parseDouble(br.readLine());
			System.out.print("The area is " + calcArea(userInput1, userInput2, userInput3));
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input.");
		}
	}

	/**
	 * Calculates the area of a triangle using its sides.
	 * 
	 * @param a
	 *            Side 1
	 * @param b
	 *            Side 2
	 * @param c
	 *            Side 3
	 * @return The area
	 */
	public static double calcArea(double a, double b, double c) {
		double semiPerimeter = (a + b + c) / 2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
		return area;
	}
}
