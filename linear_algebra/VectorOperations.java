public class VectorOperations {
    
    public static void main(String[] args){
        
    }
    
    public static double vectorLength(double[] vector ) {
        double sum=0.0;
        double length = 0.0;
       for(int i =0; i<vector.length; i++){
           sum+=Math.pow(vector[i], 2.0));  
       }
     
      length = Math.sqrt(sum);
      return length;
    }
}
