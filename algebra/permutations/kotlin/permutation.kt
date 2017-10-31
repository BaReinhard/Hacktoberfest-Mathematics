
fun permutation(n: Long, r: Long): Long = factorial(n)/factorial(n-r)

fun factorial(number: Long): Long = when (number) {
    1L -> 1L
    else -> number * factorial(number - 1)
}

