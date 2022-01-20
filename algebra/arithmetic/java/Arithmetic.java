public class Arithmetic {

    // returns the cube root of a number
    double cubeRoot(int num) {
        return Math.cbrt(num);
    }

    // returns the square root of a number
    double squareRoot(int num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int num1 = 100;
        int num2 = 10;
        System.out.println(arithmetic.cubeRoot(num1));
        System.out.println(arithmetic.squareRoot(num2));
    }
}