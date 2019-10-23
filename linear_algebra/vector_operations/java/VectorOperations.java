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
    
    public static double[] crossProduct3By3(double[] vector1, double[] vector2){
    double[] crossProduct = new double[3];
        if(vector1.length==vector2.length && vector1.length = 3){
            double determinantI = vector1[1]*vector2[2] - vector1[2]*vector2[1];
            double determinantJ = vector1[0]*vector2[2] - vector1[2]*vector2[0];
            double determinantK = vector1[0]*vector2[1] - vector1[1]*vector2[0];
            crossProduct = {determinantI, -determinantJ, determinantK};
            return crossProduct;
        } else {
            System.out.println("Dimensions of vectors do not match, or dimension is not a 3 by 3 matrix!");
            return null;
        }
    }
    
}
