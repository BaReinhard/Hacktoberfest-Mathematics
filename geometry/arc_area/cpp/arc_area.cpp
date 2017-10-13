#define _USE_MATH_DEFINES
#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int radius, angle;
    cin >> radius >> angle;
    float area = (float(angle) / 360) * (M_PI * (float(radius) * float(radius)));
    cout << area << "\n";
}
