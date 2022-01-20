#include<stdio.h>
#include<math.h>
 int main(void)
{ float a,b,c,der,x,pr=0.0001;
	scanf("%f %f %f %f",&a,&b,&c,&x);
	float y=a*x*x+b*x+c;
	der=2*a*x+b;
	while(fabs(y)>pr)
	{x=x-y/der;
	y=a*x*x+b*x+c;
        der=2*a*x+b;
	}

	printf("%f",x);

	return 0;
}
        

