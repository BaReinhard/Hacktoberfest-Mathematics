public class Elasticity {

    public static double linearStress(double force, double area) {
        if(area == 0) {
            throw new IllegalArgumentException("Area cannot be zero.");
        }
        double linearStress = force/area;
        return linearStress;
    }

    public static double linearStrain(double l, double capL) {
        if(capL == 0) {
            throw new IllegalArgumentException("L cannot be zero.");
        }
        double linearStress = force/area;
        return linearStress;
    }

    public static double youngsModulus(double capF,double capL,double capA,double l){
            if(capA == 0 || l == 0) {
            throw new IllegalArgumentException("A or l cannot be zero.");
        }
        double youngsModulus = ((capF*capL)/(capA*l));
        return youngsModulus;
    }
//Strain Energy per unit volume
    public static double strainEnergy(double indicator, double para1,double para2){
        //If indicator is 1, then para1 is stress and para2 is strain
        //If indicator is 2, then para1 is stress and para2 is Young's modulus
        //If indicator is 3, then para1 is strain and para2 is Young's modulus
        double strainEnergy;
        if(indicator == 1){
            strainEnergy = para1*para2*0.5;
        }
        else if(indicator == 2){
            strainEnergy = (0.5*((para1*para1)/para2));
        }
        else{
            strainEnergy = (0.5*para1*para1*para2);
        }
    }
}