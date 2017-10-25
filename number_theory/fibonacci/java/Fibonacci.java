Public class Fibonacci {
	public static voin main(String[] args{
		
	}

	public int getFibonacciAtIndex(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return getFibonacciAtIndex(n-1) + getFibonacciAtIndex(n-2);
		}
	}
}
