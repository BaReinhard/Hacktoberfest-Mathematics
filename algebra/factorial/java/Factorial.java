// Program for finding factorial of a number

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int result = 1;
		for (int i=n; i>=1; i--) {
			result = result * i;
		}System.out.println("Your factorial is "+result);

	}

}
