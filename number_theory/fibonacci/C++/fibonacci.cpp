/* n equals place in fib sequence
  send n to fib function to get the number from
  that position in the sequence
*/
long long fibonacci(long long n)
{
  long long pre2 = 0, pre1 = 1, ans = 0, i;
  for (i = 0; i<n; i++)
	{
	  ans = pre1+pre2;
	  pre2 = pre1;
	  pre1 = ans;
	}
  return ans;
}
