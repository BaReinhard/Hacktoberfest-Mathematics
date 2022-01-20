import java.lang.Math;

/**
*
*	Basic calculations for a Hexagon
*
*	@author Travis Lee
*
*/
public class Hexagon {
    
    /**
     * Find the area of a Hexagon
     * 
     * @param edgeLength
     * @return area of hexagon with edge length {@code edgeLength}
     */
    public static double areaRegular(double edgeLength){
        return ((3 * Math.sqrt(3)) / 2.0) * edgeLength * edgeLength;
    }
    
    /**
     * Find the perimeter of a Hexagon
     * 
     * @param edgeLength
     * @return perimeter of a hexagon with edge length {@code edgeLength}
     */
    public static double perimeterRegular(double edgeLength) {
        return 6 * edgeLength;
    }
}