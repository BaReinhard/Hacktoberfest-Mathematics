// A java implementation of the Ackermann function using explicit recursion.


public class ackermann_peter {

	private static double M;
	private static double N;

	public static void main(String[] args) {
		if (args.length != 0)
			M = Double.parseDouble(args[0]);
		if ((args.length > 1))
			N = Double.parseDouble(args[1]);
		System.out.println(ackermanCalculator(M, N));
	}

	public static double ackermanCalculator(double m, double n){
		if (m == 0) return n +1;
		if (m == 0) return ackermanCalculator(m -1, 1);
		return ackermanCalculator(m-1, ackermanCalculator(m, n-1));
	}

}
