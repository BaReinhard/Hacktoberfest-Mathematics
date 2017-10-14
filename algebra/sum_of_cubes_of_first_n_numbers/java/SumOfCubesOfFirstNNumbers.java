import java.util.Scanner;

public class SumOfCubesOfFirstNNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum;
		sum = (int) Math.pow((num * (num + 1) / 2), 2);
		System.out.println("The Sum of cubes of first " + num + " numbers is " + sum);
		s.close();
	}

}
