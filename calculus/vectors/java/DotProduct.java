public class DotProduct
{
	/** Calculate the dot product of two vectors of
	 *  equal arbitrary length represented by double arrays
	 * @param {double[]} v1 - first vector
	 * @param {double[]} v2 - second vector
	 * @return {double} dp - the result of the dot product
	*/
	public static double dotProduct(double[] v1, double[] v2)
	{
		//Multiply corresponding components
		double[] multiplied = new double[v1.length];
		for (int i = 0; i < v1.length; i++)
		{
			multiplied[i] = v1[i] * v2[i];
		}

		//Sum the multiples for the result of the dot product
		double dp = 0;
		for (double num : multiplied)
		{
			dp += num;
		}

		return dp;
	}
}
