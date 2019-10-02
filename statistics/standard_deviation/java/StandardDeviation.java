import java.util.Random;

public class StandardDeviation {

    public static double standardDeviation(int[] numbers) {
        float result = 0;
        float total = 0;
        float sum = 0;

        // average of array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        float mean = sum / numbers.length;

        // standard deviation calculation
        for (float num : numbers) {
            total += ((num - mean) * (num - mean)) / (numbers.length - 1);
        }
        result = (float) Math.sqrt(total);
        return result;
    }

    public static void main(String args[]) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            int result = array[i];

            // random array of integers
            System.out.println(result);
        }

        float stdv = (float) standardDeviation(array);
        System.out.println("The standard deviation is : " + stdv);

    }
}