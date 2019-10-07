// For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
// with a being the initial term and d being the common difference
import java.util.*;
public class A {

    // This function calculates the nth term
    public static int nth_term(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    // This function calculates the sum of the first n terms
    public static int sum_of_first_n(int a, int d, int n) {
        return ((n) * ((2 * a) + (n - 1) * d)) / 2;
    }

}
public class arithmetic_progression
{
	public static void main(String args[])
	{
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no. of a series");
		int a=sc.nextInt();
		System.out.println("Enter the common difference between");
		int d=sc.nextInt();
		System.out.println("Enter the number to find the nth term and nth sum");
		int n=sc.nextInt();
		int ans=ob.nth_term(a,d,n);
		int sum=ob.sum_of_first_n(a,d,n); 
		System.out.println("nth term = "+ans);
		System.out.println("Sum of first n term = "+sum);
	}
}
