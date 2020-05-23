#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
void main(){
     int i, n;
     float a1, a2, pi = 3.142, z[50];
     printf("Enter the sample size: \n");
     scanf("%d", &n);
     srand(time(NULL));
     for(i = 0; i <= n-1; i++){
         a1 = (float)rand() / RAND_MAX;
         a2 = (float)rand() / RAND_MAX;
         z[i] = (sqrt(-2 * log(a1)) * cos(2 * pi * a2));
     }
     printf("The required random sample is: \n");
     for(i = 0; i <= n-1; i++){
         printf("%f\n", z[i]);
     }
 }
