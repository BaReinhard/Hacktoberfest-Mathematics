Public class gravitationalForceEquation{
	//Meant to calculate teh gravitational force between two objects
	//There exists the gravitational constant of the universe G, 6.67 * 10^-11
        
	public static double final g = .0000000000667;
        
        /*@param m1 corresponds to the mass of the first object in kgs
         *@param m2 corresponds to the mass of the second object in kgs
         *@param r corresponds to the distance between both masses in meters
         */
        
        
        public static double gravitationalForce(double m1, double m2, double r){
        
               double gforce = (g*m1*m2)/(r*r);
               
               return gforce;
	}
		
}
