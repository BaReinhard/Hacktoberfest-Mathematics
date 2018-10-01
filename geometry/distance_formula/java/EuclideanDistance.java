/**
 * Euclidean distance.
 * 
 * @author Atom
 *
 */
public class EuclideanDistance {

	/**
	 * Calculates the Euclidean distance between two points
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		double r1 = x2 - x1;
		double r2 = y2 - y1;
		return Math.sqrt(r1 * r1 + r2 * r2);
	}
	
	/**
	 * Calculates the Euclidean distance for an n-dimensional space
	 * 
	 * @param uv
	 * @return
	 */
	public static double distanceNDimensional(double[][] uv) {
		double sum = 0;
		for (int i = 0; i < uv[0].length; i++) {
			double u = uv[0][i];
			double v = uv[1][i];
			double r = v - u;
			sum += r * r;
		}
		return Math.sqrt(sum);
	}
	
	public static void main(String[] args) {
		double[][] uv = {
				{ 5, 7, 9, 0, -1 },
				{ 2, 3, 4, 5, 7 }
		};		
		System.out.println(distance(5, 7, 2, 4));	
		System.out.println(distanceNDimensional(uv));
	}

}
