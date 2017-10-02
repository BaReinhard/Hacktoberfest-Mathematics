public class TrigFunc {

    /**
     * Gives approximation of sine using taylor series
     * @param angle angle in radians
     * @param iterations number of terms in taylor series
     * @return sine of angle
     */
    public static double sin(double angle, int iterations){
        double result = 0.0;
        double angleMod = angle % (2 * Math.PI);

        angle = ((angle - angleMod) / (2 * Math.PI )) + angleMod; //puts angle in [0, 2*PI] interval

        for (int n = 0; n < iterations; n++) {
            result += Math.pow(-1.0, n) * Math.pow(angle, 2 * n + 1) / factorial(2 * n + 1);
        }

        return result;
    }

    /**
     * Gives approximation of cosine using taylor series
     * @param angle angle in radians
     * @param iterations number of terms in taylor series
     * @return cosine of angle
     */
    public static double cos(double angle, int iterations){
        double result = 0.0;
        double angleMod = angle % (2 * Math.PI);

        angle = ((angle - angleMod) / (2 * Math.PI )) + angleMod; //puts angle in [0, 2*PI] interval

        for (int n = 0; n < iterations; n++) {
            result += Math.pow(-1.0, n) * Math.pow(angle, 2 * n) / factorial(2 * n);
        }

        return result;
    }

    /**
     * Gives approximation of tangent using taylor series of sine and cosine
     * @param angle angle in radians
     * @param iterations number of terms in taylor series for sine and cosine
     * @return tangent of angle
     */
    public static double tan(double angle, int iterations){
        return sin(angle, iterations) / cos(angle, iterations);
    }

    public static double factorial(int n){
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
