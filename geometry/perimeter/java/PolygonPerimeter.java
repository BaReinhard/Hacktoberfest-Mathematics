import java.awt.geom.Point2D;

public class PolygonPerimeter {
	
	/*
		Find the area of a polygon represented as an array of n points.
		The points are assumed to be sorted in either clockwise or counter-clockwise order.
	*/
	public static double perimeter(Point2D.Double[] polygon) {
		int n = polygon.length;
		double p = 0.0;
		for(int i=0; i<n; i++) {
			int j = (i+1)%n;
			p += polygon[i].distance(polygon[j]);
		}
		return p;
	}
	
}
