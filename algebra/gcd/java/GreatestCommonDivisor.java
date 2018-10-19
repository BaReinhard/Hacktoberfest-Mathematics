import java.math.BigInteger;

public class GreatestCommonDivisor{
    public static int getGCD(int x, int y){
         return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
    }
}
