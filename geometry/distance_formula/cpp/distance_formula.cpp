#include <iostream>
#include <math.h>

using namespace std;

double calculate_distance(pair<int, int> u, pair<int, int> v) {
  return sqrt((u.first - v.first)*(u.first - v.first) + (u.second - v.second)*(u.second - v.second));
}

int main() {
  pair<int, int> u = make_pair(5, 4);
  pair<int, int> v = make_pair(5, 5);
  cout << calculate_distance(u, v);
  return 0;
}
