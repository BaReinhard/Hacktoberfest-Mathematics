public class PythagoreanFormula {

    public static boolean PythagoreanValidator(double a, double b, double c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static double retrieveHypotenuse (double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
