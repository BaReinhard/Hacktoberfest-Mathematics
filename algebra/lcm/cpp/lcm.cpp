#include<bits/stdc++.h>
using namespace std;
int gcd(int a,int b)
{
	if(a%b==0)
		return b;
	else
		return gcd(b,a%b);
}
int main()
{
	int a,b,ans;
	cout<<"Enter two numbers:"<<endl;
	cin>>a>>b;
	if(a>b)
		ans=gcd(a,b);
	else
		ans=gcd(b,a);
	long long int product=a*b;
	cout<<product/ans<<endl;
	return 0;
}
