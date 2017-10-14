
/**
 * A polygon with six sides and six interior angles is known as hexagon.
 * A regular hexagon resembles a convex figure with sides of the same length, and comprises of internal angles of 120 degrees.
 * The area of hexagon is determined using the side and radius of it i.e. s and r.
 *
 * @author Shrikrushna Atkalikar
 */
public class HexagonArea {

    /**
     *  The Area of a Hexagon Formula is area = 3sr
     *
     * @param s - the side of the hexagon in cm.
     * @param r - the radius of the hexagon in cm.
     * @return area of Hexagon in cm^2
     */
    public static double calculate(double s, double r) {
        checkArgument(s, "side");
        checkArgument(s, "radius");
        return 3 * s * r;
    }

    private static void checkArgument(double value, String param) {
        if(value <= 0) {
            throw new IllegalArgumentException(param + " of a Hexagon can not be negative or zero.");
        }
    }
}