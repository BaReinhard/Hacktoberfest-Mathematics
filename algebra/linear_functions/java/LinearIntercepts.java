public class LinearIntercepts {
    
    /**
     * 
     * Outputs the x intercept: x value when y is 0
     * 
     * @param linearFunction Linear function
     * @return x value when y is 0
     */
    public static double interceptX(DoubleFunction<Double> linearFunction){
        
        double b = linearFunction.apply(0);
        double m = (linearFunction.apply(1) - linearFunction.apply(0));
        
        if(m == 0)
            throw new IllegalArgumentException("Linear function has no x intercept!");
        
        return -b/m;
        
    }
    
    /**
     * 
     * Outputs the y intercept: y value when x is 0
     * 
     * @param linearFunction Linear function
     * @return y value when x is 0
     */
    public static double interceptY(DoubleFunction<Double> linearFunction){
        
        return linearFunction.apply(0);
        
    }
    
}
