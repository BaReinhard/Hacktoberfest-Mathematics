/**
 * @author santanaraj.esguerra
 * github link: https://github.com/akiyamamio16
 */
public class Free_Fall {

    public static double height(double gravity, double seconds){
        double h = (0.5)*gravity*Math.pow(seconds,2);
        return h;
    }
    
    public static double velocity(double gravity, double seconds){
        double v = gravity*seconds;
        return v;
    }
    
    public static double time(double velocity, double gravity){
        double t = velocity/gravity;
        return t;
    }
    
    //Execution for Test Purpose
    public static void main(String[] args){
        double gravity = 9.80665;
        double time = 5;
        
        double height =height(gravity,time);
        double velocity = velocity(gravity,time);
        time = time(velocity,gravity);
        System.out.println(height+" meter");
        System.out.println(velocity+" m/s");
        System.out.println(time+" seconds");
    }
}
