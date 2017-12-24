#include <bits/stdc++.h>
using namespace std;

int main()
{
	int n=0,r=0;
	cin>>n>>r;
	int ncr=1;

	for(int i=r-1;i>=0;i--)
		ncr*=n-i;
	for(int i=1;i<=r;i++)
		ncr/=i;

	cout<<ncr;
	return 0;
}
