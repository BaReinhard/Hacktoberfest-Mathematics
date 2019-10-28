import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * A moving average is a technique to get an overall idea of the trends in a data set;
 * it is an average of any subset of numbers.
 * The moving average is extremely useful for forecasting long-term trends.
 * You can calculate it for any period of time.
 * An average represents the “middling” value of a set of numbers.
 * The moving average is exactly the same, but the average is calculated several times for several subsets of data.
 *
 * @author Gandhali Ambike.
 */
public class SimpleMovingAverage {

    /**
     * Calculates and returns the moving average of given data set and intervals
     * @param dataSet collection of data points
     * @param intervals window size
     * @return moving average data set
     */
    public static List<Double> calculate(List<Integer> dataSet, int intervals) {
        return sliding(dataSet, intervals).map(s -> s.stream().mapToInt(p -> p).average().getAsDouble()).collect(toList());
    }

    private static <T> Stream<List<T>> sliding(List<T> list, int size) {
        if (size > list.size())
            return Stream.empty();
        return IntStream.range(0, list.size() - size + 1)
                .mapToObj(start -> list.subList(start, start + size));
    }

}
