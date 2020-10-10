
public class Circle {

	public float getArea(float radius){
		float area = (float) (Math.PI * radius * radius);
		return area;
	}
	
	public static float getDiameter(float radius){
		float diameter = 2*radius;
		return diameter;
	}
	
	public static float getCircumference(float radius){
		float circumference = (float) (Math.PI * getDiameter(radius));
		return circumference;
	}
	
	public static float getArcLength(float degrees, float radius){
		float arcLength = (float) ((degrees/360)*Math.PI*getDiameter(radius));
		
		return arcLength;
	}
	
	public static boolean pointOnCircle(float radius, float xCenter, float yCenter, float x, float y){
		return (float) Math.sqrt(Math.pow(xCenter - x, 2) + Math.pow(yCenter - y, 2)) == radius ? true : false;
	}
	
}
