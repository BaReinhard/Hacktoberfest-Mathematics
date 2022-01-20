public class CalculateFibonacci {
    //1,2,3,5,8,13,21,34,55,89,144,...
    public Integer findFibonacci(Integer number) {
        switch (number) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                Integer fib = 0;
                Integer previous = 1;
                Integer previous2 = 1;
                for (int i=2; i<number; i++) {
                    fib = previous2 + previous;
                    previous = previous2;
                    previous2 = fib;
                }
                return fib;
        }
    }

    public static void main (String[] args) {
        CalculateFibonacci calculateFibonacci = new CalculateFibonacci();
        System.out.println(calculateFibonacci.findFibonacci(10));
    }
}
