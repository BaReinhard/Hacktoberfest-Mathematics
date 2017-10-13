/**
 * Created by robertoduessmann on 03/10/17.
 */
public class ClockAngle {

	public static double getAngle(int hour, int minute) {

		double hourAngle = 0.5 * (hour * 60 + minute);

		double minAngle = 6 * minute;

		double angleCalc = Math.abs( hourAngle - minAngle );

		double angle = Math.min( angleCalc, 360 - angleCalc );

		return angle;
	}

	public static void main(String[] args) {
		System.out.println( getAngle( 3, 0 ) );
	}
}