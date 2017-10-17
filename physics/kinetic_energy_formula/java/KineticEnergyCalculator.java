/**
 * The Kinetic energy is the energy that an object has due to its motion.
 *
 * @author Shrikrushna Atkalikar
 */
public class KineticEnergyCalculator {

    /**
     * Calculates Kinetic energy for given parameters.
     * @param m - mass of an Object
     * @param v - velocity
     * @return Kinetic energy of the moving object
     */
    public static double calculate(double m, double v) {
        checkArgument(m, "Mass");
        checkArgument(v, "Velocity");
        return 0.5 * m * v * v;
    }

    private static void checkArgument(double value, String param) {
        if (value < 0) {
            throw new IllegalArgumentException(param + " can not be negative.");
        }
    }
}