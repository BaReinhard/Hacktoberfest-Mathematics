//
// Created by Jonatan Witoszek on 30.10.2017.
//

#include <iostream>
#include <cmath>

using namespace std;

double pi = 3.14159265;

double get_radians(double degree) {
    return degree*pi/180;
}

double area(double a, double h) {
    return a*h/2;
}

double angleArea(double a, double b, double angle) {
    return  a*b*sin(get_radians(angle));
}

double heronArea(double a, double b, double c) {
    double p = (a+b+c)/2;
    return sqrt(p*(p-a)*(p-b)*(p-c));
}

int main() {
    cout << "Choose method of calculation: " << endl;
    cout << "1) Simple" << endl;
    cout << "2) Angles" << endl;
    cout << "3) Heron" << endl;

    int method;
    cin >> method;

    double a, b;

    switch (method) {
        case 1:
            double h;
            cout << "a = ";
            cin >> a;
            cout << "h = ";
            cin >> h;
            cout << "area = " << area(a, h);
            break;
        case 2:
            double angle;
            cout << "a = ";
            cin >> a;
            cout << "b = ";
            cin >> b;
            cout << "angle between sides = ";
            cin >> angle;
            cout << "area = " << angleArea(a, b, angle);
            break;
        case 3:
            double c;
            cout << "a = ";
            cin >> a;
            cout << "b = ";
            cin >> b;
            cout << "c = ";
            cin >> c;
            cout << "area = " << heronArea(a, b, c);
            break;
        default:
            cout << "Please choose method from 1 to 3...";
    }

    cin.get();
    cin.get();
    return 0;
}
