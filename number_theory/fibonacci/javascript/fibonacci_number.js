/* n equals place in fib sequence
  send n to fib function to get the number from
  that position in the sequence
*/
function fib(n){
  let a = 1, b = 0, temp;

  while (n >= 0){
    temp = a;
    a = a + b;
    b = temp;
    n--;
  }

  return b;
}
