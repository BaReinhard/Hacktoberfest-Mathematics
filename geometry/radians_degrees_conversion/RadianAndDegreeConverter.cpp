#include <iostream>
#include <math.h>

using namespace std;

double degreesToRadians(double deg) {
  return deg * M_PI/180;
}

double radiansToDegrees(double rad) {
  return rad * 180/M_PI;
}

int main() {
	cout << degreesToRadians(60) << endl;
	cout << radiansToDegrees(M_PI/3);
	return 0;
}
