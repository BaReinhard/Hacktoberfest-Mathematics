// Estimation of PI using Leibniz formula
public class LeibnizFormula {
    public static double pi(int terms) {
        double atanOfOne = 0; // initial estimation of atan(1) = pi/4
        for(int i = 0; i < terms; i++) {
            atanOfOne += Math.pow(-1, i) / (2*i + 1);
        }
        return atanOfOne * 4;
    }

    public static void main(String[] args) {
        System.out.println(LeibnizFormula.pi(10_000_000));
    }
}
