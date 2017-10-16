
/**
 * <p>
 * Wavelength is the distance between the crests of a wave.
 * It is represented with the Greek letter lambda: λ.
 * It is equal to the velocity of the wave, divided by the frequency. Wavelength is expressed in units of meters (m).
 * Methods from this class can be used to calculate the Wavelength.
 * </p>
 *
 * @author Shrikrushna Atkalikar
 */
public class WaveLengthCalculator {

    /**
     * This method calculates the wavelength if Wave Velocity and Frequency is given.
     * <p>
     * <p>Wavelength formula is λ = v/f</p>
     *
     * @param v - wave velocity, the speed that waves are moving in a direction (m/s)
     * @param f - frequency, the wave crests that go through a point in a certain time (cycles/s or Hz)
     * @return λ - wavelength, the distance between wave crests (m)
     */
    public static double calculateWavelength(double v, double f) {
        checkArgument(v, "Wave velocity");
        checkArgument(f, "Frequency");
        if (f == 0d) {
            return 0d;
        }
        return v / f;
    }


    /**
     * This method calculates the Frequency if Wave Velocity and Wave Length is given.
     *
     * @param v          - wave velocity, the speed that waves are moving in a direction (m/s)
     * @param waveLength - wavelength, the distance between wave crests (m)
     * @return frequency, the wave crests that go through a point in a certain time (cycles/s or Hz)
     */
    public static double calculateFrequency(double v, double waveLength) {
        checkArgument(v, "Wave velocity");
        checkArgument(waveLength, "Wave Length");
        if (waveLength == 0d) {
            return 0d;
        }
        return v / waveLength;
    }

    private static void checkArgument(double value, String param) {
        if (value < 0) {
            throw new IllegalArgumentException(param + " can not be negative.");
        }
    }
}