#include <iostream>
using namespace std;

int main()
{
    int n, sum = 0;

    cout << "Enter a positive integer: ";
    cin >> n;

	//the sum of the first n numbers can be simplified as (n^2-n)/2
	n=((n*n)-n)/2

    cout << "Sum = " << sum;
    return 0;
}
