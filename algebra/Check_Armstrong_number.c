#include <stdio.h>

int main(){
    int n, sum = 0, c, r;
    printf("Enter a Number: ");
    scanf("%d", &n);
    c = n;
    while(n > 0){
        r = n % 10;
        sum = sum + (r * r * r);
        n = n / 10;
    }
    if (sum = c) {
        printf("%d is an Armstrong Number\n", c);
    }
    else {
        printf("%d is not an Armstrong Number\n", c);
    }
    return 0;
}
