/**
 ** Java Program to implement Nth Root Algorithm
 **/

import java.util.Scanner;

/** Class NthRoot **/
public class NthRoot {
    private double nthroot(int n, double x) {
        return nthroot(n, x, .0001);
    }
    private double nthroot(int n, double x, double p) {
        if(x < 0)
        {
            System.err.println("Negative!");
            return -1;
        }
        if(x == 0)
            return 0;
        double x1 = x;
        double x2 = x / n;
        while (Math.abs(x1 - x2) > p)
        {
            x1 = x2;
            x2 = ((n - 1.0) * x2 + x / Math.pow(x2, n - 1.0)) / n;
        }
        return x2;
    }
    /** Main **/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nth Root Algorithm Test\n");
        System.out.println("Enter n and x");
        int n = scan.nextInt();
        double x = scan.nextInt();
        NthRoot nr = new NthRoot();
        double root = nr.nthroot(n, x);
        System.out.println("\nRoot = "+ root);
    }
}
