// error in computation of sin(x)

#include <iostream>
#include <cmath>

using namespace std;

long int fact(int number);
int main()
{
    long double x;
    int term_len;
    cout<<"enter x"<<endl;
    cin>>x;
    cout<<"enter no of terms"<<endl;
    cin>>term_len;

    double _sin = sin(x);
    double sum = 0.0;
    for(int i = 1, j=0; j < term_len; i+=2,j++)
    {
        long double term = pow(-1,j)* (pow(x,i)/fact(i));
        sum+= term;

    }
    long double difference = abs(_sin-sum);
    cout.precision(10);
    cout<<_sin<<"\n"<<sum<<endl;

    cout<<"relative error"<<difference<<endl;
    double relative_err = (difference/abs(_sin))*100.0;
    cout<<"% error"<<relative_err;
}


long int fact(int number)
{
    if (number == 0)
        return 1;
    else
        return number * fact(number - 1);
}
