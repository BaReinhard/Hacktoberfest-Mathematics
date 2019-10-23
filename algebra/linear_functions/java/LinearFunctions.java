public class LinearFunctions {
    
    public static double slope(double x1, double y1, double x2, double y2){
        
        if (x1 == x2){ // vertical line has a NaN/undetermined slope
            System.out.println("Line is vertical. It has an undetermined slope");
            return null;
        }
        
        return (y2-y1)/(x2-x1);
        
    }
    
    public static double distance(double x1, double y1, double x2, double y2){
        
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        
    }
    
    public static double yIntercept(double x1, double y1, double x2, double y2){
        
        double slope = slope(x1, y1, x2, y2);
        
        if (slope != null){ // assuming not a vertical line
            return (y1-slope*x1);
        } else {
            System.out.println("Line is vertical. It has no y intercept");
            return null;
        }
    }
        
        
    
}
