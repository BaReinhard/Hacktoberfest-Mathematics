import java.lang.*;

class RadiansAndDegrees{
	
	public static double degrees_to_radians(double degrees){
		return degrees * Math.PI/180;
	}

	public static double radians_to_degrees(double radians){
		return radians * 180/Math.PI;
	}

	public static void main(String[] args){
		System.out.println(radians_to_degrees(Math.PI/3));
		System.out.println(degrees_to_radians(60));
	}


	
}
