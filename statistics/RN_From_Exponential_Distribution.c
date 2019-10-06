#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

void main(){
    int i, n;
    float a1, x[50], t;
    printf("Enter the sample no. : \n");
    scanf("%d", &n);
    printf("Enter the value of theta: \n");
    scanf("%f", &t);
    srand(time(NULL));
    for(i = 0; i <= n-1; i++){
        a1 = (float) rand()/ RAND_MAX;
        x[i] = (-t) * log(1 - a1);
    }
    printf("The required samples are: \n");
    for(i = 0; i <= n-1; i++){
         printf("%f\n", x[i]);
     }
}
