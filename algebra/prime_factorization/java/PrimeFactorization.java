import java.util.ArrayList;

public class PrimeFactorization {

    public static ArrayList<Integer> getPrimeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i < number / i; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        if (number > 2) {
            factors.add(number);
        }

        return factors;
    }

    public static void main(String[] args) {
        int number = 30;
        ArrayList<Integer> primeFactors = getPrimeFactors(number);

        for (Integer primeFactor : primeFactors) {
            System.out.println(primeFactor);
        }
    }
}