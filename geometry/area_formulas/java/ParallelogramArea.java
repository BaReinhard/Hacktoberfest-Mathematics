package hacktobermaths;

public class ParallelogramArea {
	
	// The area of a parallelogram is half the sum of the parallel sides times the distance between them
	// This method will calculate the area of a parallelogram if you know the two parallel sides and the
	// height of the parallelogram
	
	public static double parallelogramArea (double side1, double side2, double height) {
		double area = ((side1 + side2)/2)*height;
		return area;
	}
}
