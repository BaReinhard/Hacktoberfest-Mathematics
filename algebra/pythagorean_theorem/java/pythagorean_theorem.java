
// method to perform pythagorean theorm to find the length of a right triangle's hypotenuse


public class pythagorean_theorem{
    public static void main(String[] agrs){
	// a being the length of triangle side a
	// b being the length of triangle side b
	// c being the length of the hypotenuse
	double a = 3;
	double b = 4;

	double hypotenuse = hypotenuseCalc(a,b);

	System.out.println("Hypotenuse of your triangle = " +hypotenuse);

    }
	public static double hypotenuseCalc(double a, double b){
		// a being the length of triangle side a
		// b being the length of triangle side b
		// c being the length of the hypotenuse, will be returned 
		double c = 0;

		//theorm is sqrt(a^2 + b^2)
		a = a*a;
		b = b*b;
		
		c = Math.sqrt(a+b);
		return c;
	}

}