import java.math.BigInteger

fun getGCD(x: Long, y: Long): Long = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).toLong()