/*
 * Created by OMKAR JADHAV
 */

package utils;

/**
 * This class implements number theory algorithms like ExtendedEuclidanAlgorithm, GCD, LCM,
 * Modulo Multiplicative Inverse, etc
 */
public class NumberTheoryUtil {

    /**
     * Euclidean algorithm for finding CGD of two numbers
     * @param a
     * @param b
     * @return Gcd of a and b
     */
    public static long gcd(long a, long b) {
        if (a % b == 0 ) {
            return b;
        }
        return gcd(b, a % b);
    }

    /**
     * Helper class to hold values of x, y when passing it
     */
    private static class Pair {
        long x, y;
    }

    private static long extendedEuclideanHelper(long a, long  b, Pair currentCoefficients) {
        if (a == 0 ) {
            currentCoefficients.x = 0;
            currentCoefficients.y = 1;
            return b;
        }
        Pair nextIteration = new Pair();
        long gcd = extendedEuclideanHelper(b%a , a, nextIteration);
        currentCoefficients.x = nextIteration.y - (b/a)* nextIteration.x;
        currentCoefficients.y = nextIteration.x;
        //System.out.println( "a->" + a + " b -> " + b + " x1 -> " + nextIteration.x + " y1 -> " + nextIteration.y);
        return gcd;
    }

    /**
     * Calculates gcd of a and b along with that it also calculate values of x and y in
     * equation a*x + b*y = gcd(a, b)
     * @param a First value
     * @param b Second value
     * @return Returns array of format {gcd, x, y}
     */
    public static long[] extendedEuclidean(long a, long b) {
        Pair coefficients = new Pair();
        long gcd = extendedEuclideanHelper(a, b, coefficients);
        return new long[] {gcd, coefficients.x, coefficients.y};
    }

    /*
     * Multiplicative Inverse method implementations
     */

    /**
     * Naive modulo inverse method. Time complexity: O(mod)
     * @param num Numbers of modulo inverse is to be found
     * @param mod Value if modulo variable
     * @return
     */
    public static long moduloInverseNaive(long num, long mod ) {

        if (gcd(num, mod) > 1 || mod <= 1) {
            throw new IllegalArgumentException(num + " and " + mod + " must be co-prime");
        }

        num = num % mod;
        long inverse = 0;
        for (long j = 1; j < mod; ++j) {
            if (j * num % mod == 1) {
                inverse = j;
                break;
            }
        }
        return inverse;
    }

    /**
     * This method finds modulo inverse using extended euclidean algorithm.
     * Time complexity log10( min(a, b) )
     * @param num
     * @param mod
     * @return
     */
    public static long moduloInverseExtendedEuclidean(long num, long mod) {
        if (gcd(num, mod) > 1 || mod <= 1) {
            throw new IllegalArgumentException(num + " and " + mod + " must be co-prime");
        }
        long inverse = extendedEuclidean(num, mod)[1];
        if (inverse < 0 ) {
            inverse += mod;
        }
        return inverse;
    }

    /**
     * Function to check if given number is prime or not. Time Complexity : O(sqrt(num))
     * @param num
     * @return true if num is prime
     */
    public static boolean isPrime(long num) {
        for(long j = 2; j*j <= num; ++j ) {
            if (num % j == 0 ) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates  pow(a, b) % mod.  Time Complexity: O(log2(b))
     */
    public static long modPower(long a, long b, long mod ) {
        long res = 1;
        if (b > 0) {
            long half = modPower(a, b/2, mod);
            res = (half * half) % mod;
        }
        return b % 2 == 1 ? (res * a) % mod : res;
    }

    /**
     * This method finds modulo inverse of num (% primeNumber) using Fermat's Little Theorem.
     * The number mod must be prime. O(log2(primeNumber))
     * @param num
     * @param primeNumber
     * @return
     */
    public static long moduloInverseFermats(long num, long primeNumber ) {
        if (!isPrime( primeNumber )) {
            throw new RuntimeException("Modulo varibale is not prime");
        }
        num %= primeNumber;
        long inverse = modPower(num, primeNumber - 2, primeNumber);
        return inverse;
    }


}
