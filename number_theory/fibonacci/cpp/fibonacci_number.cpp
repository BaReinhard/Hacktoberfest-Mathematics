
// O(2^n) time | O(n) space

using namespace std;

int getNthFib(int n) {
  if (n == 2) {
    return 1;
  } else if (n == 1) {
    return 0;
  } else {
    return getNthFib(n - 1) + getNthFib(n - 2);
  }
}
