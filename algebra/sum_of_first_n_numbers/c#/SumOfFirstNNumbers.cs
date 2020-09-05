namespace SumOfFirstNNumbers
{
    public class SumOFFirstNNumbers
    {
        static int SumOfFirstNNumbers(int n)
        {
            int sum = 0;
            for (int i = 1; i <= n; i++)
            {
                sum += i;
            }

            return sum;
        }
    }
}
