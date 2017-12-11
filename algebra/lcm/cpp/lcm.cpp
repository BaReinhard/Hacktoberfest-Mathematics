#include <iostream>
using namespace std;

int gcd(int first, int second) {
	if (second == 0)
		return first;
	else
		return gcd(second, (first % second));
}

int lcm(int first, int second) {
     return first * second / gcd(first, second);
}

int main() {

     int first, second;
     cin >> first >> second;

     cout << lcm(first, second);

     return 0;
}
