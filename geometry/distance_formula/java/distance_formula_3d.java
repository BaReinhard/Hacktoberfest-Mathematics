public class DistanceFormula3d {
	
    public static double distanceFormula3d(double x1, double y1, double z1, double x2, double y2, double z2) {
		
        double distanceAnswer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		
        return distanceAnswer;
    }
	
}
