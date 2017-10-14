/**
 * Calculate the Bézout's identity of 'a' and 'b' recursively
 * using the extended euclidean algorithm.
 *
 * Based on the Python implementation created by (https://github.com/prudywsh)
 */
public class Bezout {
    public static String bezout(long a, long b, long x, long y) {
        // 'b' must be greater than 'b'
        if (b > a) {
            long temp = a;
            a = b;
            b = temp;
        }

        long remainder = a % b;

        // GCD (greatest common divisor) found
        if (remainder == 0) {
            return "(" + b + ", " + x + ", " + y + ")";
        }

        long quotient = (int) (a / b);

        long prevX = x;
        long prevY = y;
        x = quotient * x + prevX;
        y = quotient * y + prevY;

        return bezout(b, remainder, x, y);
    }

    public static String bezout (long a, long b) {
        return bezout(a, b, 0, 1);
    }

    // Testing
    public static void main(String[] args) {
        String t1 = bezout(5, 2);
        String t2 = bezout(63, 2);
        String t3 = bezout(65, 613);
        String t4 = bezout(6315136417L,7413748588L);

        System.out.println(t1.equals("(1, 0, 3)"));
        System.out.println(t2.equals("(1, 0, 32)"));
        System.out.println(t3.equals("(1, 0, 120)"));
        System.out.println(t4.equals("(1, 0, 412782428160)"));
    }
}
