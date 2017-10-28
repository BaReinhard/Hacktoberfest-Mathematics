import java.lang.Math;

public class Sphere {
    
    /**
     * Find the surface area of a sphere
     * 
     * @param radius
     * @return surface area of sphere with radius {@code radius}
     */
    public static double surfaceArea(double radius){
        return 4 *  Math.PI * radius * radius;
    }
    
    /**
     * Find the volume of a sphere
     * 
     * @param radius
     * @return volume of a sphere with radius {@code radius}
     */
    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;        
    }
}
