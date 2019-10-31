// Calculates sample size given standard deviation, margin of error and t-value
public class CalculateSampleSize {

    public static int calculateSampleSize(double sd, double marginError, double tValue) {
        double size = Math.pow(((tValue * sd) / marginError), 2);
        return (int) Math.round(size);
    }
}
