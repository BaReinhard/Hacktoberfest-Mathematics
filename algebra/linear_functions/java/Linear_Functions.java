public class LinearFunctions {
    
    public static double slope(double x1, double y1, double x2, double y2){
        
        return (y2-y1)/(x2-x1);
        
    }
    
    public static double distance(double x1, double y1, double x2, double y2){
        
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        
    }
    
}
