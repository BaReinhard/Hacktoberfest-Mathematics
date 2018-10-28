// Returns the sum of the fist N prime numbers as inputted by user.
// You can convert it into a method as well by

import java.util.Scanner;
import java.util.stream.IntStream;

public class sum_of_first_n_primes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int primeDividend = 2;

        int[] numList = new int[n];
        while (counter != n) {

            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(primeDividend); i++) {

                if (primeDividend % i == 0) {
                    prime = false;
                    break;
                }

            }

            if (prime) {
                numList[counter] = primeDividend;
                counter++;
            }
            primeDividend++;
        }

        System.out.println("Sum of the first " + n + " primes " + IntStream.of(numList).sum());

    }

}
