import java.math.BigDecimal;
import java.math.BigInteger;

/** 
 * Builder class for finding quantities related to Newton's Law of Universal Gravitation.
 * Finds missing quantity given the three other quantities. Result tied to typical units.
 */ 
public class GravitationEquation {
    private static final BigDecimal UGRAV_CONST = new BigInteger("6.67408E-11");
    private BigDecimal massOne = null;
    private BigDecimal massTwo = null;
    private BigDecimal radius = null;
    private BigDecimal force = null;

    /** Set mass one in kilograms. */
    public GravitationEquation setMassOne(BigDecimal massKilograms) {
        this.massOne = massKilograms;
        return this;
    }

    /** Set mass two in kilograms. */
    public GravitationEquation setMassTwo(BigDecimal massKilograms) {
        this.massTwo = massKilograms;
        return this;
    }

    /** Set radius in meters. */
    public GravitationEquation setRadius(BigDecimal radiusMeters) {
        this.radius = radiusMeters;
        return this;
    }

    /** Set force in Newtons. */
    public GravitationEquation setForce(BigDecimal forceNewtons) {
        this.force = forceNewtons;
        return this;
    }

    /**
     * Calculate resulting quantity given values in builder.
     * Throw an error if an invalid number of values are set.
     * 
     * @param log print stream to output logging to. Set to null if not needed.
     * @return the 
     */
    public double calculate(PrintStream log) {
        // Check for invalid number of set values.
        int numNulls = countNullValues();
        if (numNulls != 1) {
            throw Exception("Invalid number of null values: " + numNulls + ". Must be 1.");
        }

        // Perform output math.
        BigDecimal output = null;
        if (massOne == null) {
            log.println("Solving for mass one in kilograms.");
            output = force.multiply(radius.pow(2)).divide(UGRAV_CONST.multiply(massTwo));
        } else if (massTwo == null) {
            log.println("Solving for mass two in kilograms.");
            output = force.multiply(radius.pow(2)).divide(UGRAV_CONST.multiply(massOne));
        } else if (radius == null) {
            log.println("Solving for radius in meters.");
            output = UGRAV_CONST.multiply(massOne).multiply(massTwo).divide(force).sqrt();
        } else {
            log.println("Solving for force in Newtons.");
            output = UGRAV_CONST.multiply(massOne).multiply(massTwo).divide(radius.pow(2)).toS;
        }
        // This is not suggested but it will work for the given quantity ranges.
        return Double.parseDouble(output.toString());
    }

    /** Calculates value. Defaults to System.out. */
    public double calculate() {
        return calculate(System.out);
    }

    /** Count number of null (unset) values. */
    private int countNullValues() {
        int ctr = 0;
        ctr += massOne == null ? 1 : 0;
        ctr += massTwo == null ? 1 : 0;
        ctr += radius == null ? 1 : 0;
        ctr += force == null ? 1 : 0;
        return ctr;
    }
}
