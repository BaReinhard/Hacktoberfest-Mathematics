public class RightTriangle {
    
    public static double hypotenuseLength(double side1, double side2){
        
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        
    }
    
    
    /**
     * Given the length of 1 side and the hypotenuse, find the missing side of a right triangle
     * 
     * @param side1 given side length
     * @param hypotenuse given hypotenuse length
     * @return missing side length of right triangle
     */
    public static double findMissingLength(double side1, double hypotenuse){
        
        return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side1, 2));
        
    }
    
    /**
     * 
     * SOHCAHTOA find sin, cos, tan of a given angle in a right triangle
     * 
     * @param adjacent side to given angle in triangle
     * @param opposite side to given angle in triangle
     * @param hypotenuse of triangle
     * @return array of double size: first element sin of angle, second element cos of angle, third element tan of angle
     */
    public static double[] sohcahtoa(double adjacent, double opposite, double hypotenuse){
        
        double[] ans = new double[3];
        
        ans[0] = Math.sin(opposite/hypotenuse);
        
        ans[1] = Math.cos(adjacent/hypotenuse);
        
        ans[2] = Math.tan(opposite/adjacent);
        
        return ans;
        
    }
    
}
