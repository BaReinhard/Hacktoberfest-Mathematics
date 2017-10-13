/**
 * Contains classes which construct a mathematical polynomial.
 */
package mypolynomial;

import java.io.*;
import java.util.*;

/**
 * Interacts with the user.
 * 
 * @author shivanishirolkar
 */
public class PolynomialIO {

	/**
	 * Controls the flow of construction of a mathematical polynomial. The maximum
	 * number of coefficients is 10.
	 * 
	 * @throws IOException
	 *             if there are errors with input/output.
	 */
	public static void runFlow() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> p = new ArrayList<Double>();
		System.out.println("Type in the polynomials in increasing powers:");
		Polynomial polynomial = new Polynomial(p);
		try {
			for (int count = 0; count <= 10; count++) // makes sure number of coefficients does not exceed 10
			{
				polynomial.setUserInput(br.readLine());
				if (polynomial.getUserInput().isEmpty()) {
					break;
				} else {
					polynomial.addCoefficient(polynomial.getUserInput());
				}
			}
			System.out.println(polynomial.toString());
		} catch (IllegalArgumentException e) {
			runFlow();
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            Command line argument (not used)
	 * @throws IOException
	 *             if there are errors with input/output.
	 */
	public static void main(String args[]) throws IOException {
		runFlow();
	}
}
