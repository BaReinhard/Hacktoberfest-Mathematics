
/**
 * Perimeter class returns the perimeter of basic geometry shapes
 */
public class Perimeter 
{
	/**
	 * Find perimeter of a circle
	 * @param radius
	 * @return perimeter
	 */
    double circle(double radius)
    {
        return 2 * Math.PI * radius;
    } 
    
    /**
     * Find perimeter of a square
     * @param side
     * @return perimeter
     */
    double square(double side){
    	return side * 4;
    }
    
    /**
     * Find perimeter of a rectangle
     * @param length
     * @param base
     * @return perimeter
     */
    double rectangle(double length, double base)
    {
        return 2 * (length + base);
    }
    
    /**
     * Find perimeter of a triangle
     * @param s1
     * @param s2
     * @param s3
     * @return perimeter
     */
    double triangle(float s1, float s2, float s3)
    {
        return s1 + s2 + s3;
    }
    
    /**
     * Find perimeter of a parallelogram
     * @param s1
     * @param s2
     * @param s3
     * @param s4
     * @return perimeter
     */
    double parallelogram(double s1, double s2, double s3, double s4)
    {
    	return s1 + s2 + s3 + s4;
    }
    
    /**
     * Find perimeter of a trapezoid.
     * @param height
     * @param base1
     * @param base2
     * @return perimeter
     */
    double trapezoid(double height, double base1, double base2)
    {
    	return height * (base1 + base2)/2;
    }
}
