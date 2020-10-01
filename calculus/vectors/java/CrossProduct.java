public class CrossProduct {
    /**
     * Calculate the cross product of two vectors
     * in R3 represented by double arrays
     * @param v1 - first vector
     * @param v2 - second vector
     * @return the result of the cross product
     */
    public static double[] crossProduct(double[] v1, double[] v2) {
        if (v1.length != 3 || v2.length != 3) {
            throw new IllegalArgumentException("Cross product is only defined for two vectors of R3");
        }
        return new double[] {
                v1[1] * v2[2] - v1[2] * v2[1],
                v1[2] * v2[0] - v1[0] * v2[2],
                v1[0] * v2[1] - v1[1] * v2[0],
        };
    }
}