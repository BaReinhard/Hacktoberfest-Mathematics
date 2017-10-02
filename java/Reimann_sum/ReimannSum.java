
public class ReimannSum
{
	/** Calculate the area underneath the curve using a right Reimann sum
	 * @param {double} lowerBound - the lowerBound of the Reimann Sum
	 * @param {double} upperBound - the upper bound of the Reimann Sum
	 * @param {double} dx - the change in x, essentially how "small" the rectangle is
	 * @param {Equation} equation - the equation of the curve
	 * @return {double} sum - the approximate area underneath the curve of equation from lowerBound to upperBound
	*/
	public static double rightReimannSum(double lowerBound, double upperBound, int divisions, Equation equation)
	{
		double sum = 0;
		double dx = (upperBound - lowerBound) / divisions;
		for(double i = lowerBound + dx; i <= upperBound; i += dx)
		{
			sum += equation.evaluateEquation(i)*dx;
		}
		return sum;
	}
	
	/** Calculate the area underneath the curve using a left Reimann sum
	 * @param {double} lowerBound - the lowerBound of the Reimann Sum
	 * @param {double} upperBound - the upper bound of the Reimann Sum
	 * @param {double} dx - the change in x, essentially how "small" the rectangle is
	 * @param {Equation} equation - the equation of the curve
	 * @return {double} sum - the approximate area underneath the curve of equation from lowerBound to upperBound
	*/
	public static double leftReimannSum(double lowerBound, double upperBound, int divisions, Equation equation)
	{
		double sum = 0;
		double dx = (upperBound - lowerBound) / divisions;
		for(double i = lowerBound; i < upperBound; i += dx)
		{
			sum += equation.evaluateEquation(i)*dx;
		}
		return sum;
	}
	
	/** Calculate the area underneath the curve using a midpoint Reimann sum
	 * @param {double} lowerBound - the lowerBound of the Reimann Sum
	 * @param {double} upperBound - the upper bound of the Reimann Sum
	 * @param {double} dx - the change in x, essentially how "small" the rectangle is
	 * @param {Equation} equation - the equation of the curve
	 * @return {double} sum - the approximate area underneath the curve of equation from lowerBound to upperBound
	*/
	public static double midpointReimannSum(double lowerBound, double upperBound, int divisions, Equation equation)
	{
		double sum = 0;
		double dx = (upperBound - lowerBound) / divisions;
		for(double i = lowerBound + dx/2; i <= upperBound; i += dx)
		{
			sum += equation.evaluateEquation(i)*dx;
		}
		return sum;
	}
}
