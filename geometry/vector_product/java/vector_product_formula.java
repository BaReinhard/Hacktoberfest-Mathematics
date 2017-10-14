// Two 3-D Vectors product (vector = {x, y, z})

public class vectorProduct {
	public static double[] calculateVectorProduct(double[] vector1, double[] vector2) {
		double[] vectorProduct = new double[3];
    
		if(vector1.length != 3 || vector2.length != 3) {
			throw new IllegalArgumentException("Vectors must have 3 dimensions (x, y, z) for the product formula to be used!");
		}
		else {
			vectorProduct[0] = vector1[1]*vector2[2] - vector1[2]*vector2[1];
			vectorProduct[1] = vector1[2]*vector2[0] - vector1[0]*vector2[2];
			vectorProduct[2] = vector1[0]*vector2[1] - vector1[1]*vector2[0];
		}
    
		return vectorProduct;
	}
}
