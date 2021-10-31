public class AreaPlaneShapes {

	public static double triangle(double base, double height) {
		return (base * height) / 2;
	}

	public static double rectangle(double width, double height) {
		return width * height;
	}

	public static double square(int length) {
		return length * length;
	}

	public static double circle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
}