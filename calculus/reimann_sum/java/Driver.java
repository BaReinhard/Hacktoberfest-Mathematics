
public class Driver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Equation eq = new Equation("x^2");
		
		System.out.println(ReimannSum.midpointReimannSum(0, 4, 500000, eq));
	}

}
