#include <stdlib.h>
#include <stdio.h>
#include <math.h>

double evalFunc(double x) {
    return (1 * pow(x, 2) + 7 * pow(x, 1) + 4);
}

double evalDeriv(double x) {
    return (2 * pow(x, 1) + 7);
}

int main() {
    char *function = calloc(100 * sizeof(char), sizeof(char));
    char *derivative = calloc(100 * sizeof(char), sizeof(char));
    double startVal = 0;
    int reps = 0;
    // printf("\nEnter a function of x (x^2+7x+4): ");
    // scanf("%s", function);
    // printf("\nEnter the derivative of the function (2x+7): ");
    // scanf("%s", derivative);
    printf("\nEnter a starting value (int): ");
    scanf("%lf", &startVal);
    printf("\nEnter the max number of repetitions (int): ");
    scanf("%d", &reps);
    
    // printf("%f, %f\n", evalFunc(5), evalDeriv(5));
    
    int i = 0;
    double prevVal = startVal;
    for (i = 0; i < reps; i ++) {
        startVal = (startVal - (evalFunc(startVal) / evalDeriv(startVal)));
        printf("%d: %f\n", i, startVal);
        
        if (prevVal == startVal) {
            break;
        } else {
            prevVal = startVal;
        }
    }
    
    printf("Final Value: %f\n", startVal);
    
    return 0;
}