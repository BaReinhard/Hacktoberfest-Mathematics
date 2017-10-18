public class Arithmetic {

	public static double squareRoot(int number, int digits){
		return Math.round(Math.sqrt(number)*Math.pow(10, digits)) / (double) Math.pow(10, digits);
	}
	
	public static double cubeRoot(int number, int digits){
		double value = Math.round(Math.pow(number, 1.0/3.0)*Math.pow(10, digits)) / (double) Math.pow(10, digits);
		if(number >= 0) return value;
		else return -1*value;
	}
	
	public static int digitSum(int number){
		int sum = 0;
		while(number > 0){
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}

}
