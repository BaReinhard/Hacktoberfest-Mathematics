/**
 * Calculate the Bézout's identity of 'a' and 'b' recursively
 * using the extended euclidean algorithm.
 * <p>
 * Based on the Python implementation created by (https://github.com/prudywsh)
 */
public class Bezout {
    public static double[] bezout(long a, long b, long x, long y) {
        // 'b' must be greater than 'b'
        if (b > a) {
            long temp = a;
            a = b;
            b = temp;
        }

        long remainder = a % b;

        // GCD (greatest common divisor) found
        if (remainder == 0) {
            return new double[]{b, x, y};
        }

        long quotient = (int) (a / b);

        long prevX = x;
        long prevY = y;
        x = quotient * x + prevX;
        y = quotient * y + prevY;

        return bezout(b, remainder, x, y);
    }

    public static double[] bezout(long a, long b) {
        return bezout(a, b, 0, 1);
    }
}
