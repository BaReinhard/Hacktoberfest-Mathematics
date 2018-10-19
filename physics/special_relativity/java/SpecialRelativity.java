public class SpecialRelativity{
    public static void main(String args[]) {
       
    }
    
    //calculate the relativistic mass depending on velocity and the resting mass 
    //velToLightspeed is the v/c
    public double relativisticMass(double mass, double velToLightSpeed){
        double relMass = 0.0;
        if(velToLightSpeed<1){
            relMass= mass/(Math.sqrt(1-(Math.pow(velToLightSpeed, 2.0))));
        }else{
            System.out.println("You cannot travel faster than light!");
        }
        
         return relMass;
    }
}
