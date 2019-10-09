#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void main(){
    int i, j, n, p;
    float a1, a2, pi = 3.142, z[50], x[50];
    printf("Enter the no. of sample: \n");
    scanf("%d", &n);
    printf("p: \n");
    scanf("%d", &p);
    srand(time(NULL));
    for(j = 0; j <= n-1; j++){
        float sum = 0;
        for(i = 0; i <= p-1; i++){
            a1 = (float)rand() / RAND_MAX;
            a2 = (float)rand() / RAND_MAX;
            z[i] = (sqrt(-2 * log(a1)) * cos(2 * pi * a2));
            sum = sum + (z[i] * z[i]);
        }
        x[j] = sum;
    } 
    printf("The required random sample is: \n");
     for(i = 0; i <= n-1; i++){
         printf("%f\n", x[i]);
     }
}
