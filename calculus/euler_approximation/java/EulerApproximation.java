public class EulerApproximation {
    
    /**
     * 
     * Finding the Euler approximation
     * 
     * @param function DERIVATIVE FUNCTION
     * @param x1 initial point x value
     * @param y2 initial point y value
     * @param x2 x value to approximate value
     * @param steps in how many steps
     * @return
     */
    public static double approximate(DoubleFunction<Double> function, double x1, double y2, double x2, double steps){
        
        double stepSize = (x2 - x1)/steps;
        double nextX = x1;
        double answer = 0d;
        
        while(nextX != x2){
            
            answer = y2 + function.apply(nextX)*stepSize;
            
            y2 = answer;
            
            nextX += stepSize;
            
        }
        
        return answer;
        
    }
    
    /**
     * 
     * Finding the Euler approximation
     * 
     * @param function DERIVATIVE FUNCTION given both x and y
     * @param x1 initial point x value
     * @param y2 initial point y value
     * @param x2 x value to approximate value
     * @param steps in how many steps
     * @return
     */
    public static double approximate(ToDoubleBiFunction<Double, Double> function, double x1, double y2, double x2, double steps){
        
        double stepSize = (x2 - x1)/steps;
        double nextX = x1;
        double answer = 0d;
        
        while(nextX != x2){
            
            answer = y2 + function.applyAsDouble(nextX, y2)*stepSize;
            
            y2 = answer;
            
            nextX += stepSize;
            
        }
        
        return answer;
        
    }
    
}
