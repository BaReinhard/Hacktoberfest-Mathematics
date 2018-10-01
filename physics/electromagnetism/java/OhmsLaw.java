import java.util.HashSet;

/**
 * Provides equations for Ohm's law triangle.
 *
 * @author vatsal mevada
 */
public class OhmsLaw {

    /**
     * Calculates voltage value using given current and resistance.
     *
     * @param iAmps current in Amperes
     * @param rOhms resistance in Ohms
     * @return voltage in Volts
     */
    public static double getVoltage(double iAmps, double rOhms) {
        return iAmps * rOhms;
    }

    /**
     * Calculates current using given resistance and voltage.
     *
     * @param vVolts voltage in Volts
     * @param rOhms  resistance in Ohms
     * @return current in Amperes
     */
    public static double getCurrent(double vVolts, double rOhms) {
        if (rOhms == 0) {
            throw new RuntimeException("The value of resistance can not be zero.");
        }
        return vVolts / rOhms;
    }

    /**
     * Calculates resistance using given current and voltage.
     *
     * @param vVolts voltage in Volts
     * @param iAmps  current in Amperes
     * @return resistance in Ohms
     */
    public static double getResistance(double vVolts, double iAmps) {
        if (iAmps == 0) {
            throw new RuntimeException("The value of current can not be zero.");
        }
        return vVolts / iAmps;
    }
}
