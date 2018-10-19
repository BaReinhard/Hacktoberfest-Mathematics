/**
 * A sigmoid function is a special case of logistic function.
 * <p/>
 * A sigmoid function provides bounded non-negative value in the range of 0 and 1 for any given real number resulting
 * into a S-shaped curve(sigmoid curve) when plotted against input value.
 * <p/>
 * It is widely used in machine learning algorithms. e.g. Logistic Regression, Neural network
 * <p/>
 * Reference: <a href="https://en.wikipedia.org/wiki/Sigmoid_function">Sigmoid Function Wikipedia</a>
 *
 * @author vatsal mevada
 */
public class SigmoidFunction {

    /**
     * Utility method which computes sigmoid function
     * @param x any real number (Theoretically between -infinity and +infinity however over here it is bounded by the
     *          limits of the double type)
     * @return sigmoid of x
     */
    public static double sigmoid(double x) {
        return 1 / (1 + Math.pow(Math.E, -x));
    }

    /**
     * Contains some minimal tests checking the correctness of the sigmoid function. Throws a {@link RuntimeException}
     * if any of the test fails. Does nothing otherwise.
     *
     * @param args
     */
    public static void main(String[] args) {
        if(sigmoid(1000) != 1){
            throw new RuntimeException("Sigmoid function for large positive value should always return 1.");
        }
        if(sigmoid(0) != 0.5){
            throw new RuntimeException("Sigmoid function for value zero should always return 0.5.");
        }
        if(sigmoid(-1000) != 0){
            throw new RuntimeException("Sigmoid function for large negative value should always return 0.");
        }
    }
}
