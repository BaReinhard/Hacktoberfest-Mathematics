public class ElectricFields {

    //Constant of electric field constant with 8.845e-12 [C^2/N*m^2]
    public static final double E_FIELD_CONSTANT = 8.854e-12;

    /**
     * Calculate the electric field of a spherical charge depending on its distance to the charge.
     * @param electricCharge {double} - strength of the particles charge (e.g. electron charge = 1.602e-19)
     * @param radius {double} - distance to the spherical charge where you want to calculate its electric field
     * @return {double} power of the electric field in Volt per meter (Newton per Coulomb) at the given radius
     */
    public static double fieldOfHomogeneousSpehereAt(double electricCharge, double radius){
        if(radius <= 0 ) throw new IllegalArgumentException("Never seen negative radius.");
        return (electricCharge)/(4*Math.PI*E_FIELD_CONSTANT*(radius*radius));
    }

    /**
     * Calculate the electric field of a indefinitely long ladder given its homogeneous distributed line charge density
     * at the given distance
     * @param lineChargeDensity {double} - the homogeneous distributed line charge density
     * @param distance {double} - distance at which we want to calculate the electric field
     * @return {double} power of the electric field in Volt per meter (Newton per Coulomb) at the given distance
     */
    public static double fieldOfLadderAt(double lineChargeDensity, double distance){
        if(distance <= 0) throw new IllegalArgumentException("Never seen a negative ladder.");
        return (lineChargeDensity)*(1/(2*Math.PI*E_FIELD_CONSTANT*distance));
    }

    /**
     * Calculate the electric field of a indefinitely extended plane given its surface charge density
     * @param surfaceChargeDensity {double} - surface charge density
     * @return {double} power of the electric field in Volt per meter (Newton per Coulomb)
     */
    public static double fieldOfPlane(double surfaceChargeDensity){
        return 0.5*(surfaceChargeDensity/E_FIELD_CONSTANT);
    }

    /**
     * Calculate the electric field of a plate capacitor given its applied voltage and distance between both plates
     * @param voltage {double} - the applied voltage
     * @param distance {double} - the distance between both plates
     * @return {double} power of the electric field in Volt per meter (Newton per Coulomb) at every position between both plates
     */
    public static double fieldOfPlateCapacitor(double voltage, double distance){
        if(distance <= 0) throw new IllegalArgumentException("Never seen a negative distance.");
        return voltage/distance;
    }

    /**
     * Calculate the electrical potential at a distance r from a source charge q is
     * @param charge {double} - source charge
     * @param distance {double} - the distance from the source
     * @return {double} Electrical potential
     */
    public static double electricPotentialFromSourceCharge(double charge, double distance){
        if(distance <= 0) throw new IllegalArgumentException("Never seen a negative distance.");
        return charge/(4*Math.PI*E_FIELD_CONSTANT*distance);
    }

    /**
     * The magnitude of the force between two electrically charged objects to be
     * @param charge1 {double} - charge 1
     * @param charge2 {double} - charge 2
     * @param distance {double} - the distance between charges
     * @return {double}  magnitude of the force between two electrically charged objects
     */
    public static double electricPotentialFromSourceCharge(double charge1, double charge2, double distance){
        if(distance <= 0) throw new IllegalArgumentException("Never seen a negative distance.");
        return (charge1*charge2)/(4*Math.PI*E_FIELD_CONSTANT*distance*distance);
    }

    /**
     * The only preferred directions are radially inward or outward, and we associate those directions with the sign of the source. The force felt by a test particle in this field is
     * @param charge {double} - charge placed in the electric field
     * @param efield {double} -  electric field
     * @return {double}  force F felt by a test particle in the field E
     */
    public static double electricPotentialFromSourceCharge(double charge, double efield){
        return (charge*efield);
    }


}