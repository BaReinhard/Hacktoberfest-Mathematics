//how to evaluate the perimeter of a trapezoid

#include <iostream>

using namespace std;

int main()
{
    int a, b, c, d;
    int perimeter;

    cout << "what's the length of base a?";
    cin >> a;
    cout << "what's the length of base b?";
    cin >> b;
    cout << "what's the length of side c?";
    cin >> c;
    cout << "what's the length of side d?";
    cin >> d;

    perimeter = a + b + c + d;
    cout << "the perimeter of this trapezoid is " << perimeter;
}