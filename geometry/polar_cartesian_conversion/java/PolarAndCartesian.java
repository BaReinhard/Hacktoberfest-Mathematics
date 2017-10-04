import java.util.*;

class PolarAndCartesian{

    public static double[] cartesianToPolar(double x, double y){
    	
		double[] rAndTheta = new double[2];
    	rAndTheta[0] = Math.sqrt(x*x + y*y); //radius
    	rAndTheta[1] = Math.atan2(y, x); 	 //theta
    	return rAndTheta;
    }

    public static double[] polarToCartesian(double r, double theta){
    	double[] cartesianCoords = new double[2];
    	cartesianCoords[0] = Math.cos(theta)*r; //x value
    	cartesianCoords[1] = Math.sin(theta)*r; //y value
    	return cartesianCoords;


    }
}
