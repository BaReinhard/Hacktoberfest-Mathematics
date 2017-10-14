<?php
class Distribution
{
    const PRINT = true;
    /**
     * Frequency distribution
     *
     * The values of the input array will be the keys of the result array.
     * The count of the values will be the value of the result array for that key.
     *
     * @param array $values Ex: ( d, e, a, a, d, a )
     * @return array frequency distribution Ex: ( a => 3, d => 2, e => 1 )
     */
    public static function frequency(array $values): array
    {
        $frequencies = array();
        foreach ($values as $value) {
            if (!isset($frequencies[$value])) {
                $frequencies[$value] = 1;
            } else {
                $frequencies[$value]++;
            }
        }
        return $frequencies;
    }
    /**
     * Relative frequency distribution
     *
     * Relative Frequency = Frequency / Sample Size
     */
    public static function relativeFrequency(array $values): array
    {
        $sample_size          = count($values);
        $relative_frequencies = array();
        foreach (self::frequency($values) as $subject => $frequency) {
            $relative_frequencies[$subject] = $frequency / $sample_size;
        }
        return $relative_frequencies;
    }
    /**
     * Cumulative frequency distribution
     *
     */
    public static function cumulativeFrequency(array $values): array
    {
        $running_total          = 0;
        $cumulative_frequencies = array();
        foreach (self::frequency($values) as $value => $frequency) {
            $running_total += $frequency;
            $cumulative_frequencies[$value] = $running_total;
        }
        return $cumulative_frequencies;
    }
    /**
     *
     * Cumulative relative frequency = cumulative frequency / sample size
     *
     * The values of the input array will be the keys of the result array.
     * The cumulative frequency of the values will be the value of the result array for that key.
     *
     * @param array $values Ex: ( A, A, A, A, A, A, B, B, B, C )
     * @return array cumulative relative frequency distribution Ex: ( A => 0.6, B => 0.9, C => 1 )
     */
    public static function cumulativeRelativeFrequency(array $values): array
    {
        $sample_size            = count($values);
        $cumulative_frequencies = self::cumulativeFrequency($values);
        return array_map(
            function ($frequency) use ($sample_size) {
                return $frequency / $sample_size;
            },
            $cumulative_frequencies
        );
    }
    /**
     * Stem and leaf plot
     *
     * Optional parameter to print the stem and leaf plot.
     * Given input array: [ 44 46 47 49 63 64 66 68 68 72 72 75 76 81 84 88 106 ]
     * Prints:
     *   4 | 4 6 7 9
     *   5 |
     *   6 | 3 4 6 8 8
     *   7 | 2 2 5 6
     *   8 | 1 4 8
     *   9 |
     *  10 | 6
     *
     * @param array $values
     */
    public static function stemAndLeafPlot(array $values, bool $print = false): array
    {
        // Split each value into stem and leaf
        sort($values);
        $plot = array();
        foreach ($values as $value) {
            $stem = $value / 10;
            $leaf = $value % 10;
            if (!isset($plot[$stem])) {
                $plot[$stem] = array();
            }
            $plot[$stem][] = $leaf;
        }
        // Fill in any empty keys in the distribution we had no stem/leaves for
        $min = min(array_keys($plot));
        $max = max(array_keys($plot));
        for ($stem = $min; $stem <= $max; $stem++) {
            if (!isset($plot[$stem])) {
                $plot[$stem] = array();
            }
        }
        ksort($plot);
        // Optionally print the stem and leaf plot
        if ($print === true) {
            $length = max(array_map(function ($stem) {
                return strlen($stem);
            }, array_keys($plot)));
            foreach ($plot as $stem => $leaves) {
                printf("%{$length}d | %s\n", $stem, implode(' ', $leaves));
            }
        }
        return $plot;
    }
}
$values = array(44, 46, 47, 49, 63, 64, 66, 68, 68, 72, 72, 75, 76, 81, 84, 88, 106, );
$result = Distribution::frequency($values);
$result_rel = Distribution::relativeFrequency($values);
$result_cul = Distribution::cumulativeRelativeFrequency($values);
$result_plot = Distribution::stemAndLeafPlot($values, $print=true);
echo "<h2>Stem and leaf shown above, and The Results are Listed Below:</h2>";

echo"<p><h4>The Relative Frequency is:</h4></p>";
var_dump($result);
echo"<p><h4>The Relative Frequency is:</h4></p>";
var_dump($result_rel);
echo"<p><h4>The Cumulative Relative Frequency is:</h4></p>";
var_dump($result_cul);
