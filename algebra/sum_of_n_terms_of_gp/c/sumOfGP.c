#include<stdio.h>
#include<math.h>

void main(){
  float n,r,a,sum;
  printf("Enter the first term of the GP then Common Ratio then number of terms.\n");
  scanf("%f%f%f",&a,&r,&n);
  sum=(a*(1-pow(r,n)))/(1-r);
  printf("The sum of first %.0f terms is %f\n",n,sum);
}

