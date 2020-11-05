public class add {

    public static void main(String[] args) {
        // adds two numbers from users input
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();


        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }

}
