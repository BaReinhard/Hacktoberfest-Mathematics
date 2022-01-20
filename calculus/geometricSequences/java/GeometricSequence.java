
public class GeometricSequence {
	// Calculates the Sum of First n Terms of a Geometric Sequence based on the
	// first two values
	// of the given sequence separated by commas
	// Function throws argumentException if illegal sequence provided or sum
	// does not exist.
	// Usage: getFiniteSum("a1,a2,a3.....an",n)
	// where a1 is first term, a2 is second term an is nth term. And n is the
	// number of terms to add.
	// Realistically only the first two terms are required to calculate the sum
	// Returns sum in decimal form.

	public static double getFiniteSum(String sequence, int n) {

		String[] seqNumbers = sequence.split(",");

		try {

			for (int i = 0; i < seqNumbers.length; i++) {
				if (seqNumbers[i].contains("/")) { // Convert Fractions into
													// Decimal Values
					seqNumbers[i] = String.valueOf(convertFractionToDecimal(seqNumbers[i]));
				}
			}

			double a1 = Double.valueOf(seqNumbers[0]);
			double a2 = Double.valueOf(seqNumbers[1]);
			double r = getCommonRatio(a1, a2);
			double result = 0;

			if (r == 1) {
				throw new IllegalArgumentException("Sum Does not Exist as Common Ratio is 1");
			} else {
				// Sn = a1(1-r^n)/(1-r)
				result = (a1 * (1.0 - Math.pow(r, n))) / (1.0 - r);
			}

			return result;

		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid Sequence Provided.");
		}
	}

	private static double getCommonRatio(double a1, double a2) {
		return a2 / a1;
	}

	private static double convertFractionToDecimal(String fraction) {
		int index = fraction.indexOf("/");
		double result;

		result = Double.valueOf(fraction.substring(0, index))
				/ Double.valueOf(fraction.substring(index + 1, fraction.length()));

		return result;
	}

}
