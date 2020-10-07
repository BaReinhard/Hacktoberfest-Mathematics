using System;

namespace Math {
    class Factorial {
        public static int factorial(int num) {
            int factorial = 1;

            for (int i=1;i<=num;i++) {
                factorial *= i;
            }
            return factorial;
        }

        public static void Main(string[] args) {
            int result = factorial(5);
            Console.WriteLine(result);
        }
    }
}
