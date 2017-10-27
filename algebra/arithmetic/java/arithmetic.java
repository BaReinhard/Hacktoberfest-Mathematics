class Arithmetic
{
    public static void main(String[] args) {
        System.out.println("The square root of 237 is: "+Arithmetic.squareRoot(237.0));
        System.out.println("The cube root of 237 is: "+Arithmetic.cubeRoot(237.0));
        System.out.println("the sum of digits of 237 is: "+Arithmetic.digit_sum(237));
    }
    static double squareRoot(double num)
    {
        return Math.sqrt(num);
    }
    static double cubeRoot(double num)
    {
        return Math.cbrt(num);
    }
    static double digit_sum(int num)
    {
        int d=0, s=0;
        while(num != 0)
        {
            d = num % 10;
            s = s + d;
            num = num / 10;
        }
        return s;
    }
}