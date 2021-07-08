#include <iostream>

using namespace std;

long long recursive_fib(int n) {
  if (n == 0) return 0;
  if (n == 1) return 1;
  return recursive_fib(n-1) + recursive_fib(n-2);
}

long long linear_fib(int n) {
  long long f0 = 0;
  long long f1 = 1;
  long long f = f1;
  for(int i = 2; i <= n; ++i) {
    f = f0 + f1;
    f0 = f1;
    f1 = f;
  }
  return f;
}

int main() {
  cout << recursive_fib(15) << endl;
  cout << linear_fib(15) << endl;
  return 0;
}
