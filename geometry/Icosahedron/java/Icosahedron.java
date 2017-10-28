import java.lang.Math;

/**
*
* Basic Icosahedron calculations
*
* @author Travis Lee
*/
public class Icosahedron {
	
	/**
	* Find the volume of an Icosahedron
	*
	* @param edgeLength
	* @return The volume of an Icosahedron with edge length {@code edgeLength}
	*/
	public static double volume(float edgeLength) {
		return ((5 * (3 + Math.sqrt(5))) / 12) * edgeLength * edgeLength * edgeLength;
	}
	
	/**
	* Find the surface area of an Icosahedron
	*
	* @param edgeLength
	* @return The surface area of an Icosahedron with edge length {@code edgeLength}
	*/
	public static double surfaceArea(float edgeLength) {
		return 5 * Math.sqrt(3) * edgeLength * edgeLength;
	}
}