import java.awt.geom.Point2D;

public class PolygonArea {
	
	/*
		Find the area of a simple polygon (meaning it doesn't intersect itself).
		The polygon is represented as an array of n points.
		The points are assumed to be sorted in counter-clockwise order.
		If they are sorted in clockwise order, this algorithm will return the negative of the area.
	*/
	public static double area(Point2D.Double[] polygon) {
		int n = polygon.length;
		double a = 0.0;
		for(int i=0; i<n; i++) {
			int j = (i+1)%n;
			a += polygon[i].x*polygon[j].y - polygon[j].x*polygon[i].y;
		}
		return a/2.0;
	}
		
}
