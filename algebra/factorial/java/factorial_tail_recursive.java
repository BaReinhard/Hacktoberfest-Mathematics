//Java 1.8 or later
public class factorial_tail_recursive {
	/*
	 * This version does'nt causes the StackOverflow exception when n is big
	 * Long should be the return type to avoid int overflow with big multiplications.
	 */
	public static long factorial(int n) {
		return factorial(n - 1, n);
	}

	private static long factorial(int n, long acc) {
		if (n == 0)
			return acc;
		else
			return factorial(n - 1, acc * n);
	}
}
