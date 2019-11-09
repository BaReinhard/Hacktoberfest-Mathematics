import java.util.*;

public class LCM {

    public static int gcd(int a, int b) {
        while (b % a != 0) {
            int r = b % a;
            b = a;
            a = r;
        }
        return a;

    }

    public static void main(String args[]) {
        int a = 2;
        int b = 4;
        int lcm = (a * b) / (gcd(a, b));
        System.out.println(lcm);

    }

}
