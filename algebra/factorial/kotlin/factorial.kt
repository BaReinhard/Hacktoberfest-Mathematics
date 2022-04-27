fun factorial(number: Long): Long = when{
    number == 1L -> 1L
    else -> number * factorial(number - 1)
}