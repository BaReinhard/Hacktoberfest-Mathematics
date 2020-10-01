#include <iostream>
using namespace std;

int main()
{
    int a, d, n, i, tn;
    int sum = 0;

    cout<<"Enter the first term value of the A.P. series: ";
    cin>>a;
    cout<<"Enter the total numbers in the A.P. series: ";
    cin>>n;
    cout<<"Enter the common difference of A.P. series: ";
    cin>>d;
    sum = (n * (2 * a + (n - 1)* d ))/ 2;
    tn = a + (n - 1) * d;
    cout<<"Sum of the A.P series is: ";
    for (i = a; i <= tn; i = i + d )
    {
        if (i != tn)
            cout<<i<<" + ";
        else
            cout<<i<<" = "<<sum;
    }
    return 0;
}
