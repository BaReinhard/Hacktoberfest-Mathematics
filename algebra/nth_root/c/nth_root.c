
#include<stdio.h>
 
#include <math.h>
 
double root1(int,int);
 
int main()
{
    int n;
    int num1;
    double root;
    printf("Enter a number greater then 1: ");
    scanf("%d",&num1);
    if(num1>1)
    {
        printf("Enter the value for 'n'(the root to be calculated): ");
        scanf("%d",&n);
        root = root1(num1,n);
        printf("%d th Root of %d is %f\n\n", n,num1,root);
    }
    else
        printf("Wrong entry");
    return 0;
}
 
double root1(int a, int b)
{
    int j;
    double i,k=1;
    double incre = 0.01;
 
    for(i=1; i<=a; i = i+incre)
    {
        for(j=0;j<b;j++)
        {
            k=k*i;
        }
        if(a<k)
        {
            return(i-incre);
            break;
        }
        else
            k=1;
    }
}
