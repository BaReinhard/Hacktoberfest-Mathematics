#include<iostream>
using namespace std;
int main()
{
    int a,n,d;
    cout<<"Enter first number, difference and total number of elements\n";
    cin>>a>>d>>n;
    int ap=(n/2)*(2*a+(n-1)*d);
    cout<<"Sum of ap: "<<ap;
}
