#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

double evalFunc(double x, char *fun) {
    
    double coefficient = 0.0;
    double exponent = 0.0;
    double total = 0.0;
    
    int ex = 0;
    
    char *funParams = calloc(strlen(fun) + 1, sizeof(char));
    strncpy(funParams, fun, strlen(fun));
    funParams = strtok(funParams, ",;");
    while (funParams != NULL) {
        if (ex) {
            exponent = atof(funParams);
            total += coefficient * pow(x, exponent);
            ex = 0;
        } else {
            coefficient = atof(funParams);
            ex = 1;
        }
        funParams = strtok(NULL, ",;");
    }
    
    return total;
}

int main() {
    char *function = calloc(100 * sizeof(char), sizeof(char));
    char *derivative = calloc(100 * sizeof(char), sizeof(char));
    double startVal = 0;
    int reps = 0;
    printf("Function Format: coefficient,exponent;coefficient,exponent\nx^6+-2.5x^5+4x^3-17x+8 => 1,6;-2.5,5;4,3;-17,1;8,0\n");
    printf("\nEnter a polynomial function of x in the described format: ");
    scanf("%s", function);
    printf("\nEnter the derivative of the function of x in the described format: ");
    scanf("%s", derivative);
    printf("\nEnter a starting value (int): ");
    scanf("%lf", &startVal);
    printf("\nEnter the max number of repetitions (int): ");
    scanf("%d", &reps);
    printf("\n");
    
    int i = 0;
    double prevVal = startVal;
    double funTotal = 0.0;
    double derTotal = 0.0;
    for (i = 0; i < reps; i ++) {
        funTotal = evalFunc(startVal, function);
        derTotal = evalFunc(startVal, derivative);
        startVal = (startVal - (funTotal / derTotal));
        printf("%d: %f\n", i, startVal);
        
        if (prevVal == startVal) {
            break;
        } else {
            prevVal = startVal;
        }
    }
    
    printf("Final Value: %.2f\n", startVal);
    
    return 0;
}