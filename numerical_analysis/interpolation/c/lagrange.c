#include<stdio.h>
#include<stdlib.h>
#include<math.h>

#define MAX_ARRAY 10

int main()
{
  float x[MAX_ARRAY], y[MAX_ARRAY], f[MAX_ARRAY];
  float p, temp = 1, sum = 0;
  int i, n, j, k=0;
 
  printf("Enter the number of points you will be entering: \n");
  scanf("%d", &n);

  for(i = 0; i < n; i++){
   printf("Enter the value of x_%d: \n", i);
   scanf("%f", &x[i]);
   printf("Enter the value of f(x_%d): \n", i);
   scanf("%f", &y[i]);
  }
  
  printf("Enter X for finding f(x): \n");
  scanf("%f",&p);
 
  for(i = 0; i < n; i++){
    temp = 1;
    k = i;
    for(j = 0; j < n; j++){
      if(k == j)
        continue;
      else
        temp = temp * ((p - x[j]) / (x[k] - x[j]));
    }
    f[i] = y[i] * temp;
  }
  for(i = 0; i < n; i++){
     sum = sum + f[i];
  }
  printf("f(%.1f) = %f \n", p, sum);

}
