(*
 * Brief: Calculates the nth term in an arithmetic sequence.
 *
 * Note, we start the sequence from n = 0 (i.e. the first number in the
 * sequence is when n = 0).
 *
 * Requires: n >= 0
 *
 * Param a: starting value
 * Param d: difference between each term
 * Param n: number in the sequence we want to get
 *
 * Return: The nth number in an arithmetic sequence.
 *)
fun nth_term (a: int) (d: int) (n: int): int =
  if n = 0
  then a
else d + nth_term a d (n - 1)
