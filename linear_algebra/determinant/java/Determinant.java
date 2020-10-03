public class Determinant {
    /**
     * Gets the determinant of any n by n matrix
     * @param matrix the matrix to get the determinant of represented by a 2D double array
     * @return the determinant of the n by n matrix
     */
    public static double getNSizeDet(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Must be a square matrix");
        }
        if (matrix.length == 2) {
            return getStandardDet(matrix);
        }
        double det = 0;
        boolean flip = false;
        double[][] temp;
        for (int i = 0; i < matrix.length; i++ ) {
            temp = new double[matrix.length - 1][matrix.length - 1];
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 1; k < matrix.length; k++) {
                    if (i != j) {
                        int setCol = j > i ? j - 1 : j;
                        temp[k - 1][setCol] = matrix[k][j];
                    }
                }
            }
            det += (flip ? -1 : 1) * matrix[0][i] * getNSizeDet(temp);
            flip = !flip;
        }
        return det;
    }

    /**
     * Gets the determinant of a standard 2x2 matrix
     * @param matrix the matrix to get the determinant of represented by a 2D double array
     * @return the determinant of the input standard 2x2 matrix
     */
    public static double getStandardDet(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
}