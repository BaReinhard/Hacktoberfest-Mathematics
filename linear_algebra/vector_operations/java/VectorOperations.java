public class VectorOperations {
    
    public static void main(String[] args){
        
    }
    
    public static double vectorLength(double[] vector ) {
        double sum=0.0;
        double length = 0.0;
       for(int i =0; i<vector.length; i++){
           sum+=Math.pow(vector[i], 2.0);  
       }
     
      length = Math.sqrt(sum);
      return length;
    }
    
    public static double[] vectorSum (double[] vector1, double[] vector2){
    
    
        if(vector1.length==vector2.length){
          double[] sumVector = new double[vector1.length];
        	for(int i = 0; i<vector1.length; i++){
        	  sumVector[i]=vector1[i]+vector2[i];
        	}
        return sumVector;
        }else{
          System.out.println("Dimensions of vectors do not match!");
          return null;
        }
    
    }
    
    public static double dotProduct(double[] vector1, double[] vector2){
    double product = 0.0;
        if(vector1.length==vector2.length){
        for(int i = 0; i<vector1.length; i++){
        	  product+=vector1[i]*vector2[i];
        	}
            return product;
        }else{
          System.out.println("Dimensions of vectors do not match!");
          return null;
        }
    
    }
}
