#include <iostream>
using namespace std;

int gcd(int a, int b){ // fast GCD O(log(n)) using euler's theorem
	if(!b) return a;
	return gcd(b,a%b);
}

int main()
{
    int a,b;
    cout<<"Enter two numbers: \n";
    cin>>a>>b;
    cout<<"GCD: "<<gcd(a,b);
    return 0;
}
