public class VectorOperations {
	 public static void main(String[] args){
		 	double[] vec1 = {1.0d,2.0d,3.0d};
		 	double[] vec2 = {0.0d,1.0d,3.0d};
		 	try {
	        double angle = angleBetween(vec1,vec2);
		 	System.out.println(""+angle);
		 	} catch(Exception e) {e.printStackTrace();}
	 }
	    
	 public static double angleBetween(double[] vec1, double[] vec2) throws Exception {
	 	try {
	 		var lengthvec1 = vectorLength(vec1);
	 		var lengthvec2 = vectorLength(vec2);
	 		var dot = dotProduct(vec1,vec2);
	 		return Math.acos(dot / (lengthvec1 * lengthvec2));
	 	} catch(Exception e) {
	 		e.printStackTrace();
	 		throw new Exception("Unable to calculate angle!");
	 	}
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
	    
	 public static double[] vectorSum (double[] vector1, double[] vector2) throws Exception {   
		 if(vector1.length==vector2.length){
			 double[] sumVector = new double[vector1.length];
			 
			 for(int i = 0; i<vector1.length; i++){
				 sumVector[i]=vector1[i]+vector2[i];
			 }
			 
			 return sumVector;
	        }else{
	        	throw new Exception("Dimensions of vectors do not match!");
	        }	    
	 }
	    
	 public static double dotProduct(double[] vector1, double[] vector2) throws Exception {
		 double product = 0.0;
	        
		 if(vector1.length==vector2.length){
			 for(int i = 0; i<vector1.length; i++){
				 product+=vector1[i]*vector2[i];
			 }
			 return product;
		 }else{
			 throw new Exception("Dimensions of vectors do not match!");          
	     }
	 }
}
