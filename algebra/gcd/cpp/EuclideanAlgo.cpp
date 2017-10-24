//author: github.com/tadowdy
#include <iostream>
using namespace std;

int main()
{
    int x, y;
    cout << "Enter two integers: " ;
    cin >> x >> y;

    cout << "GCD: ";
    cout << gcd(x, y);
    cout << endl;

    return 0;

}

int gcd (int x, int y)
{
    if (y==0){ return x; }
    else{ return gcd(y, x %y); }
}