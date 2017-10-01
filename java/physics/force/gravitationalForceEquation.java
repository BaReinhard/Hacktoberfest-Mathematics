Public class gravitationalForceEquation{
		//There exists the gravitational constant of the universe G, 6.67 * 10^-11
        
		public static double final g = .0000000000667;
        
        /*@param m1 corresponds to the mass of the first object
         *@param m2 corresponds to the mass of the second object
         *@param r corresponds to the distance between both masses
         */
        
        
        public double gravitationalForce(double m1, double m2, double r){
        
               double force = (g*m1*m2)/(r*r);
               
               return force;
		}
		
}
