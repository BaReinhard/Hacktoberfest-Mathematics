(*
 * Brief: Calculates the sum of the first n numbers in an arithemetic sequence.
 *
 * Requires: n >= 0
 *
 * Param a: starting value
 * Param d: difference between each term
 * Param n: number of terms we want to add
 *
 * Return: The sum of the first n numbers in an arithmetic sequence.
 *)
fun sum_of_first_n (a: int) (d: int) (n: int): int =
  (n * (2 * a + (n - 1) * d)) div 2
