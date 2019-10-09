/*Factorial*/
#include <stdio.h>
#include <math.h>

int main(){
    int i, n, fact = 1;
    printf("Enter the the value: ");
    scanf("%d", &n);
    for(i = 1; i <= n; i++){
        fact = fact * i;
    }
    printf("The factorial value is %d\n", fact);
    return 0;
}
