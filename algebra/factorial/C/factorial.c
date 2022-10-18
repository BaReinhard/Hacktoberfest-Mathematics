#include <stdio.h>

int factorialFinder(int num)
{
    int i,fac=1;
    for(i=1;i<=num;i++)
    {
        fac*=i;
    }
    return fac;
}
void main()
{
    int num,result;
    printf("Enter the number whose factorial is to be found:");
    scanf("%d",&num);
    printf("\n");
    result=factorialFinder(num);
    printf("The factorial of %d is %d\n",num,result);
}