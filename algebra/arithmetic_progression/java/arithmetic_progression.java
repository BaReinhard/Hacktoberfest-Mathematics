// For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
// with a being the initial term and d being the common difference
import java.util.*;
public class arithmetic_progression {

    // This function calculates the nth term
    public static int nth_term(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    // This function calculates the sum of the first n terms
    public static int sum_of_first_n(int a, int d, int n) {
        return ((n) * ((2 * a) + (n - 1) * d)) / 2;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number of terms in arithmentic progression:");
        int n=scn.nextInt();
        System.out.println("Enter first term of Arithmentic progression:");
        int a=scn.nextInt();
        System.out.println("Enter the mean difference between each term:");
        int d=scn.nextInt();
        System.out.println(n+ "-th " + "term of an arithmetic progression is: " + nth_term(a,d,n)  );
        System.out.println("Sum of first "+ n + " terms is: "+ sum_of_first_n(a,d,n));

    }
}
