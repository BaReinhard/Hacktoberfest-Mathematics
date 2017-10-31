
/**
 * @author Casper Rysgaard
 */
public final class KinematicEquations
{
    /*
     * Asuming that acceleration is constant
     * 
     * v       = velocity (m/s)
     * v_0     = initial velocity (m/s)
     * a       = acceleration (m/s^2)
     * delta_x = change in position (m)
     * t       = time (s)
     */
    
    // If we don't know the delta_x
    public static double v (double v_0, double a, double t)
    {
        return v_0 + a * t;
    }
    
    // If we don't know the velocity
    public static double delta_x_FromAcceleration (double v_0, double a, double t)
    {
        return v_0 * t + 0.5 * a * t * t;
    }
    
    // If we don't know the time
    public static double v_squared (double v_0, double a, double delta_x)
    {
        return v_0 * v_0 + 2 * a * delta_x;
    }
    
    // If we don't know the acceleration
    public static double delta_x_FromVelocity (double v_0, double v, double t)
    {
        return 0.5 * t * (v + v_0);
    }
}
