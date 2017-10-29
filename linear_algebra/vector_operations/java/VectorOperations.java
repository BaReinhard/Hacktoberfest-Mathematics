

public class VectorOperations {
    
    public static void main(String[] args){
        double[] v1 = {1, 2, 3};
        double[] v2 = {3, 2, 1};
        // double[] v3 = vectorSum(v1, v2);
        double[] v3 = crossProduct(v1, v2);

        for (int i = 0; i < v1.length; i++) {
          System.out.print(v3[i]);
          System.out.print(" ");
        }
        System.out.println();

    }
    
    /**
     * Get the absolute value of some vector
     *
     * @param      vector  The vector
     *
     * @return     The scalar equivalent.
     */
    public static double vectorLength(double[] vector ) {
        double sum=0.0;
        double length = 0.0;
       for(int i =0; i<vector.length; i++){
           sum+=Math.pow(vector[i], 2.0);  
       }
     
      length = Math.sqrt(sum);
      return length;
    }
    
    /**
     * Sum of two vectors of any size
     *
     * @param      vector1  The vector 1
     * @param      vector2  The vector 2
     *
     * @return     The resulting vector
     */
    public static double[] vectorSum (double[] vector1, double[] vector2){
    
    
        if(vector1.length==vector2.length){
          double[] sumVector = new double[vector1.length];
        	for(int i = 0; i<vector1.length; i++){
        	  sumVector[i]=vector1[i]+vector2[i];
        	}
          return sumVector;
        }else{
          System.out.println("Dimensions of vectors do not match!");
          double[] err = new double[1];
          return err;
        }
    
    }
    

    /**
     * Dot product of two vectors of any size
     *
     * @param      vector1  The vector 1
     * @param      vector2  The vector 2
     *
     * @return     The scalar value resulting
     */
    public static double dotProduct(double[] vector1, double[] vector2){
    double product = 0.0;
        if(vector1.length==vector2.length){
        for(int i = 0; i<vector1.length; i++){
        	  product+=vector1[i]*vector2[i];
        	}
            return product;
        }else{
          System.out.println("Dimensions of vectors do not match!");
          double err = 0.0;
          return err;
        }
    }

    /**
     * Cross product of two vector of size 3
     *
     * @param      v1    The v 1
     * @param      v2    The v 2
     *
     * @return     The resulting vector
     */
    public static double[] crossProduct(double[] v1, double[] v2) {
      
      double[] v3 = new double[v1.length];
      if(v1.length == v2.length || v1.length != 3) {
        v3[0] = v1[1]*v2[2] - (v2[1]*v1[2]);
        v3[1] = v1[2]*v2[0] - (v2[2]*v1[0]);
        v3[2] = v1[0]*v2[1] - (v2[0]*v1[1]);
        return v3;
      }else{
        System.out.println("Dimensions of vectors do not match with the necessary pattern!");
        double[] err = new double[1];
        return err;
      }
    }
}
