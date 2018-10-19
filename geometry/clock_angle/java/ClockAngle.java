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

	public static double getHourHandAngle(int hour, int minute) {

		return 0.5 * (hour * 60 + minute);
	}

	public static double getMinuteHandAngle(int minute) {

		return 6 * minute;
	}

	public static void main(String[] args) {
		System.out.println( getAngle( 3, 0 ) );

		System.out.println("\r\n" + getHourHandAngle(1, 0)  );
		System.out.println( getHourHandAngle(2, 15) );
		System.out.println( getHourHandAngle(3, 30) );
		System.out.println( getHourHandAngle(4, 45) );

		System.out.println("\r\n" + getMinuteHandAngle( 0)  );
		System.out.println( getMinuteHandAngle( 15) );
		System.out.println( getMinuteHandAngle( 30) );
		System.out.println( getMinuteHandAngle( 45) );
		System.out.println( getMinuteHandAngle( 59) );
	}
}