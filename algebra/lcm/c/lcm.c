#include <stdio.h>

int gcd(int a,int b)
{
	if(b==0)
		return a;
	gcd(b,a%b);	
}

int main()
{
	int n1,n2;
	printf("Enter two numbers-");
	scanf("%d%d",&n1,&n2);
	long long int product=n1*n2;
	printf("LCM of given numbers - %lld\n",(product/gcd(n1,n2)));
}