public class VectorOperations {

	public static void main(String[] args) {

	}

	public static double vectorLength(double[] vector) {
		double sum = 0.0;
		double length = 0.0;
		for (int i = 0; i < vector.length; i++) {
			sum += Math.pow(vector[i], 2.0);
		}

		length = Math.sqrt(sum);
		return length;
	}

	public static double[] vectorSum(double[] vector1, double[] vector2) {

		if (vector1.length == vector2.length) {
			double[] sumVector = new double[vector1.length];
			for (int i = 0; i < vector1.length; i++) {
				sumVector[i] = vector1[i] + vector2[i];
			}
			return sumVector;
		} else {
			System.out.println("Dimensions of vectors do not match!");
			return null;
		}

	}

	public static double dotProduct(double[] vector1, double[] vector2) {
		double product = 0.0;
		if (vector1.length == vector2.length) {
			for (int i = 0; i < vector1.length; i++) {
				product += vector1[i] * vector2[i];
			}
			return product;
		} else {
			System.out.println("Dimensions of vectors do not match!");
			return 0;
		}

	}

	public static double[] crossProduct3By3(double[] vector1, double[] vector2){
        if(vector1.length==vector2.length && vector1.length == 3){
            double determinantI = vector1[1]*vector2[2] - vector1[2]*vector2[1];
            double determinantJ = vector1[0]*vector2[2] - vector1[2]*vector2[0];
            double determinantK = vector1[0]*vector2[1] - vector1[1]*vector2[0];
            double[] crossProduct = {determinantI, -determinantJ, determinantK};
            return crossProduct;
        } else {
            System.out.println("Dimensions of vectors do not match, or dimension is not a 3 by 3 matrix!");
            return null;
        }
    }

	public static double determinant(double[][] matrix) {
		/*
		 * Recursively take a determinant
		 */

		// Initialize a determinant
		double det = 0.0;

		if (matrix == null) {
			System.out.println("Matrix is null. Cannot take determinant.");
			return 0;
		}

		if (matrix.length == matrix[0].length) { // can only take determinant on square matrix
			int matrixLength = matrix.length;

			if (matrix.length == 1) {
				return matrix[0][0]; // 1x1 matrix, the determinant is the value
				/* this is necessary to have above the rest of the code because this is what ends
				 * the recursion when we go from a 2x2 matrix to the determinants of 4 1x1 matrices
				 */
			}

			// create a temporary empty matrix from the current matrix
			double[][] cofactorMatrix = new double[matrixLength][matrixLength];
			// create a sign (+/- multiplier) that will negate itself every operation
			int sign = 1;

			// take the determinant recursively
			for (int i = 0; i < matrixLength; i++) {
				cofactorMatrix = getCofactor(matrix, cofactorMatrix, 0, i, matrixLength);
				
				/* the determinant is the alternating sum/subtraction of the top row values 
				 * of the matrix times the determinant of the cofactor matrices */
				det += sign*matrix[0][i]*determinant(cofactorMatrix); 
				
				sign *= -1; // reverse the sign (add, then subtract, then add, ...)
			}
			
			return det;

		}

		// If matrix is not square, determinant cannot be taken
		System.out.println("Matrix is not square. Cannot take determinant.");
		return 0;

	}

	private static double[][] getCofactor(double mat[][], double cofactorMatrix[][], int currentRow, int currentColumn, int n) {
		int i = 0, j = 0;

		// Looping for each element of the matrix
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {

				// Copying the elements of the matrix into temporary matrix 
				if (row != currentRow && column != currentColumn) { /* only copy the elements which are not in current row 
																	 * and column that we're getting the cofactor for */
					cofactorMatrix[i][j] = mat[row][column];
					j++; // go to the next column in this row

					// Row is filled, so increase row index and reset column index (go to beginning of next row)
					if (j == n - 1) {
						j = 0; // reset column indexer
						i++; // increase row indexer
					}
				}
			}
		}
		return cofactorMatrix;
	}

}
