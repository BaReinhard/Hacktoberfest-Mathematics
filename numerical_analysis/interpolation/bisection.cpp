// Bisection method using Precision of 10e-3

#include <iostream>
#include <math.h>

// change the equation here
#define f(x) x*x*x-4*(x)-1


using namespace std;

int main()
{
    int pl;
    double a,b,c;
    double fa,fb,fc;
    cout<<"enter a,b"<<endl;
    cin>>a>>b;
    int i =0;
    do{
        c = double(a+b)/2.0;
        fa = f(a);
        fb = f(b);
        fc = f(c);

        cout<<i<<"\t"<<a<<" "<<fa<<" "<<b<<" "<<fb<<" "<<c<<" "<<fc<<endl;
        if( fa*fc < 0)
            b = c;
        else
            a = c;
        i++;

    }while(fabs(fc) > 10e-3);
    cout<<endl;
    cout.precision(6);
    cout<<c;
}

