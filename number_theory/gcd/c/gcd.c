#include <stdio.h>
#include <assert.h>

/*
* Given two integers a and b,
* calculate the greatest common divider between the two.
*/
int gcd(int a, int b) {
  int tmp;
  while (b != 0) {
    tmp = b;
    b = a % b;
    a = tmp;
  }
  return a;
}

int main(int argc, char const *argv[]) {
  // Test implementation
  assert(gcd(13,13) == 13); // trick case: a = b
  assert(gcd(37,600) == 1); // first argument is a prime
  assert(gcd(20,100) == 20); // one is multiplum of other
  assert(gcd(624129, 2061517) == 18913);
  return 0;
}
