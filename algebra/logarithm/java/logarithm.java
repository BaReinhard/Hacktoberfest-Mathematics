package practice;

import java.util.Scanner;

public class logarithm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What your number : ");
		int number = input.nextInt();
		System.out.print("What your base : ");
		int base = input.nextInt();
		double result =0;
		if (base == 10) {
			result =Math.log10(number);
		}
		 result = Math.log(number) / Math.log(base);
		System.out.println("Result = " + result);
	}
}
