#include <iostream>
using namespace std;

int factorial(int);

int main() {
	int n,fact;
	cout<<"Enter the number whose factorial is to found : ";
	cin>>n;
	cout<<endl;
	fact=factorial(n);
	cout<<"Factorial of "<<n<<" is : "<<fact;
	return 0;
}

int factorial(int n)
{
	if(n==0)
	{
		return 1;
	}
	else
	{
		return n*factorial(n-1);
	}
}
