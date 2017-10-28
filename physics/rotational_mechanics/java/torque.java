import java.lang.*;

public class torque {
  /*
   *@param a - the angular acceleration
   *@param i - the moment of inertia
   *@return t - the value of torque
   */
  public static double calcTorque(double a, double i) {
    double t = (a * i);
    return t;
  }
  /*
   *@param r - the distance from axle to force applied
   *@param f - the force applied 
   *@param angle - the angle between r and f in degrees
   *@return t - the resulting torque
   */
  public static double calcTorque(double r, double f, double angle) {
     angle = Math.toRadians(angle);
     double sinAngle = Math.sin(angle);
     double t = (r * f * sinAngle);
     return t;
   }
 }
