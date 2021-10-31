public class PressureEquation {
    /** Calculate the force given an object's mass and acceleration
     * @param {double} force - The applied force in N
     * @param {double} area - The area on which the force is applied in m^2
     * @return {double} pressure - pressure  Pa, or Nm^-2
     */
    public static double calculatePressure(double force, double area) {
        if(area == 0) {
            throw new IllegalArgumentException("Area cannot be zero.");
        }

        double pressure = force/area;

        return pressure;
    }
}
