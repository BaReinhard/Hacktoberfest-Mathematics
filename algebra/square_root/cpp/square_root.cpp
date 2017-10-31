#include <iostream>

double sqrt(double n, double tolerance = 0.05) {
    double x1 = 1;
    double x2 = 1;

    do {
        x1 = x2;
        x2 = x1 - ((x1 * x1) - n) / (2 * x1);
    } while(-tolerance > (x2 - x1) || (x2 - x1) > tolerance);

    return x2;
}

int main() {
    double x;
    std::cout << "Insert number to square root: ";
    std::cin >> x;
    std::cout << "sqrt(" << x << ") = " << sqrt(x) << std::endl;
}
