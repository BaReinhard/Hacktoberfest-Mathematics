/*
 * Right Triangle calculation by Khorne55	
 * @https://github.com/khorne55
 * 
 */

class Right_Triangle {
	
	
	/*
	 * Proper usage of the function:
	 * If you want to calculate the opposite side pass 0.0 as a parameter for calculateSides
	 * e.g calculateSides(5.0,0.0,7.0);
	 */
	public double calculateSides(double adjacent, double opposite, double hypotenus) {
		if(adjacent==0.0)
			double result=Math.sin(opposite/adjacent);
		else if(opposite==0.0)
			double result=Math.sin(adjacent/hypotenus);
		else if(hypotenus==0.0)
			double result=Math.sin(opposite/adjacent);
		
		
		return result;
	}
	
	
}