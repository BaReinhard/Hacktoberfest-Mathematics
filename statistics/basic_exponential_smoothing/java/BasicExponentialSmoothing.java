import java.util.Arrays;
import java.util.List;

public class BasicExponentialSmoothing {

    /**
     * Smooths a recorded times series as described at https://en.wikipedia.org/wiki/Exponential_smoothing#Basic_exponential_smoothing
     *
     * @param data  List containing the recorded data of the time series
     * @param alpha Smoothing factor (0 < alpha < 1)
     */
    private static void smooth(List<Double> data, double alpha) {
        alpha = Math.max(Math.min(alpha, 1.0), 0.0); // Enforce alpha range

        for (int t = 1; t < data.size(); t++) {
            double x_t = data.get(t);
            double s_t_1 = data.get(t - 1);
            double s_t = alpha * x_t + (1 - alpha) * s_t_1;
            data.set(t, s_t);
        }
    }

    /**
     * Smooths a recorded times series as described at https://en.wikipedia.org/wiki/Exponential_smoothing#Basic_exponential_smoothing
     * The smoothing factor alpha is set to 0.3 as default.
     *
     * @param data List containing the recorded data of the time series
     */
    private static void smooth(List<Double> data) {
        smooth(data, 0.3);
    }

    /**
     * Shows how to use the smooth function
     *
     * @param args Not used
     */
    public static void main(String[] args) {
        List<Double> testData = Arrays.asList(0.0, 0.17, 0.34, 0.85, 0.64, 0.76, 0.86, 0.93, 0.98, 1.0, 0.98, 0.93, 0.86, 0.76, 0.64, 0.5);
        BasicExponentialSmoothing.smooth(testData);
        System.out.println(Arrays.toString(testData.toArray()));
    }
}
