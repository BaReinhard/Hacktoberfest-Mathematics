#include <stdio.h>
#include <stdlib.h>

long long int fac(int v)
{
	if(v==1) return v;
	return v*fac(v-1);
}

int main()
{
	int num;
  printf("Enter the number whose factorial is to be calculated:\t");
	scanf("%d",&num);
	long long int fac_value;
	if(num==0)
	{
		printf("\n\nFactorial value of %d is:\n",num);
		printf("1\n");
	}
	else
	{
		fac_value=fac(num);
  		printf("\n\nFactorial value of %d is:\n",num);
		printf("%Ld\n",fac_value);
	}
	return 0;
}
