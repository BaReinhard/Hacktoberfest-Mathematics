/**
 * A pentagon is five-sided polygon. The five angles present in the pentagon are equal.
 * A regular pentagon has all of the sides and angles are the same as each other
 *
 * @author Shrikrushna Atkalikar
 */
public class PentagonArea {

    /**
     *  The Area of a Pentagon Formula is area = (5/2)*s*a
     *
     * @param s - the side of the hexagon in cm.
     * @param a - a is the apothem length in cm.
     * @return area of Pentagon in cm^2
     */
    public static double calculate(double s, double a) {
        checkArgument(s, "side");
        checkArgument(s, "apothem");
        return (5 / 2) * s * a;
    }

    private static void checkArgument(double value, String param) {
        if(value <= 0) {
            throw new IllegalArgumentException(param + " of a Hexagon can not be negative or zero.");
        }
    }
}
