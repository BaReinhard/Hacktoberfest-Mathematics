public class QuadraticFormula {
    
    public static double[] quadraticFormula(double a, double b, double c){
        
        double[] ans = new double[2];
        
        ans[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
        
        ans[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
                
        return ans;
        
    } 
    
}
