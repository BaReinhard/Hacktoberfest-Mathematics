import java.lang.Math;

/**
*
*	Basic calculations for a Pentagon
*
*	@author Travis Lee
*
*/
public class Pentagon {
    
    /**
     * Find the area of a Pentagon
     * 
     * @param edgeLength
     * @return area of pentagon with edge length {@code edgeLength}
     */
    public static double areaRegular(double edgeLength){
        return (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * edgeLength * edgeLength;
    }
    
    /**
     * Find the perimeter of a Pentagon
     * 
     * @param edgeLength
     * @return perimeter of a pentagon with edge length {@code edgeLength}
     */
    public static double volume(double edgeLength) {
        return 5 * edgeLength;
    }
}