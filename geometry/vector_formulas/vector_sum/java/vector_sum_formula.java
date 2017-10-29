
//Vector 3-D Sum
public class vector_sum_formula {

    public double[] calculateVectorSum(double[] vector1, double[] vector2) {
        double[] vectorSum = new double[3];

        if (vector1.length != 3 || vector2.length != 3) {
            throw new IllegalArgumentException("Vectors must have 3 dimensions (x, y, z) for this formula to be used!");
        } else {
            for (int i = 0; i < 3; i++) {
                vectorSum[i] = vector1[i]+vector2[i];
            }
        }
        return vectorSum;
    }
}
