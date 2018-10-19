#include <stdio.h>


long long int fact(int n){
  if(n==1 || n==0)return 1;
  return fact(n-1)*n;
}

long long int combination(int n,int r){
  return fact(n)/(fact(r)*fact(n-r));
}

void main(){
	int n,r;
	printf("Enter N then R from nCr\n");
	scanf("%d%d",&n,&r);
	printf("Value of %dC%d is %ld",n,r,combination(n,r));
}
