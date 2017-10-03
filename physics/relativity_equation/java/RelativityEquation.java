/**
 * Created by robertoduessmann on 03/10/17.
 */
public class RelativityEquation {

	private static final double SPEED_LIGHT = 299792458;

	public static double getEnergy(double mass) {
		double energy = mass * Math.pow( SPEED_LIGHT, 2 );
		return energy;
	}

	public static void main(String[] args) {
		System.out.println( getEnergy( 10 ) );
	}

}