// secant method using precision of 10e-6

#include <iostream>
#include <cmath>
using namespace std;

#define f(x) (x*x*x)-6*(x*x)+11*(x)-7

int main()
{
    int pl;
    double a,b,c;
    double fa,fb,fc;
    cout<<"enter a,b"<<endl;
    cin>>a>>b;
    //cout<<"enter no iteration"<<endl;
    //cin>>pl;
    do
    {
        fa = f(a);
        fb = f(b);
        c =  b- (((b-a)*fb)/(fb - fa));
        fc = f(c);
        cout<<i<<"\t"<<a<<" "<<fa<<" "<<b<<" "<<fb<<" "<<c<<" "<<fc<<endl;
        a = b;
        b = c;
    }while(fabs(fc) > 10e-6);
    cout<<endl;
    cout.precision(8);
    cout<<c;
}
