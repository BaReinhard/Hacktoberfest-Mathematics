public class HeronsFormula {
    
    public static double calculateArea(double a, double b, double c){
        
        double s = (a+b+c)/2;
        
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }
    
}