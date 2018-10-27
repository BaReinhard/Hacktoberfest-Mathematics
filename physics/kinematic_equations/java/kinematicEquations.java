
/**
 * @author Casper Rysgaard
 */
public final class KinematicEquations
{
    public static void main(String[] args)
    {
        KinematicEquations ob=new KinematicsEquation();
        Scanner sc= new Scanner(System.in);
        int ch;
        System.out.println("\tMENU\n1. delta_x unknown\n2. velocity unknown\n3. time unknown\n4. Acceleration unknown\n");
        System.out.println("Enter your choice (1 to 4)");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:int v_0,a,t;
                    System.out.print("Enter Initial Velocity :");
                    v_0=sc.nextInt();
                    System.out.print("Enter Acceleration :");
                    a=sc.nextInt();
                    System.out.print("Enter Time :");
                    t=sc.nextInt();
                    System.out.println("Final Velocity ="+ob.v(v_0,a,t));
                break;
        
            case 2: int v_0,a,t;
                    System.out.print("Enter Initial Velocity :");
                    v_0=sc.nextInt();
                    System.out.print("Enter Acceleration :");
                    a=sc.nextInt();
                    System.out.print("Enter Time :");
                    t=sc.nextInt();
                    System.out.print("Displacement= :"+ob.delta_x_FromAcceleration(v_0,a,t);
                    break;
            case 3: int v_0,a,delta_x;
                    System.out.print("Enter Initial Velocity :");
                    v_0=sc.nextInt();
                    System.out.print("Enter Acceleration :");
                    a=sc.nextInt();
                    System.out.print("Enter change in Dispalcement :");
                    delta_x=sc.nextInt();
                    System.outprint("Time= :"+ob.v_squared(v_0,a,delta_x));
                    break;
            case 4: int v_0,v,t;
                    System.out.print("Enter Initial Velocity :");
                    v_0=sc.nextInt();
                    System.out.print("Enter Final Velocity :");
                    v=sc.nextInt();
                    System.out.print("Enter Time :");
                    t=sc.nextInt();
                    System.out.println("Displacement ="+ob.delta_x_FromVelocity(v_0,v,t));
                                     break;
                                     default: System.out.print("INVALID INPUT");
                                     
        
}
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
