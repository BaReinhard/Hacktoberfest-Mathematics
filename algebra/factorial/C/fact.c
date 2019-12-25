#include<stdio.h>
int main(){
    int n,result=1;
    int i=1;
    printf("Enter the no. whose factorial needs to be found:");
    scanf("%d",&n);
    while(i<=n)
    {
	result+=result*i;
	i++;
	}
    printf("the factorial is %d",result);
 return 0;   
}
