public class WorkEquations{

    public final double GRAVITY_CONSTANT = 9.81;

    public double getWork(double force, double distance){
            return (force*distance);
    }

    public double getAcceleration(double mass, double velocity){
            return (0.5*mass*velocity*velocity);
    }

    public double getPotentialEnergy(double mass, double height){
            return (mass*GRAVITY_CONSTANT*height);
    }
}
