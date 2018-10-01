/**
 * Contains classes which constructs a mathematical polynomial.
 */
package mypolynomial;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Represents the polynomial object; consists of an array list of the
 * coefficients in the polynomial.
 * 
 * @author shivanishirolkar
 *
 */
public class Polynomial {

	/** Contains the coefficients of the Polynomial. */
	private ArrayList<Double> polynomial = new ArrayList<Double>();
	/** Input entered by the user. */
	private String userInput;
	private final char POLY_VAR = 'x';

	/**
	 * Constructs the Polynomial object.
	 * 
	 * @param p
	 *            the array list containing the coefficients.
	 */
	public Polynomial(ArrayList<Double> p) {
		setPolynomial(p);
	}

	/**
	 * Returns the array list of coefficients.
	 * 
	 * @return the list of coefficients.
	 */
	public ArrayList<Double> getPolynomial() {
		return polynomial;
	}

	/**
	 * Sets the array list of coefficients.
	 * 
	 * @param polynomial
	 *            the array list of coefficients
	 */
	public void setPolynomial(ArrayList<Double> polynomial) {
		this.polynomial = polynomial;
	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	/**
	 * Adds the values of the coefficients to the array list as entered by the user.
	 * 
	 * @throws IOException
	 *             if there are errors with input/output.
	 */
	public void addCoefficient(String userInput) throws IOException {
		try {
			double coef = Double.parseDouble(userInput);
			polynomial.add(coef);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, try again.");
		}
	}

	/**
	 * Displays a visual representation of the polynomial in its mathematical form.
	 * 
	 * @return The polynomial as a string.
	 */
	public String toString() {
		StringBuilder visual = new StringBuilder();
		for (int i = polynomial.size() - 1; i >= 0; i--) {
			int power = i;
			double val = polynomial.get(i);
			if (val == 0) {
				continue; // omits terms where the coefficient is zero
			}
			if (val < 0) {
				visual.append(" - ").append(Math.abs(val)).append(POLY_VAR + "^" + power);
			} else {
				visual.append(" + ").append(Math.abs(val)).append(POLY_VAR + "^" + power);
			}
		}

		if (visual.charAt(1) == '+') {
			visual.deleteCharAt(1);
		}
		return visual.toString();
	}
}
