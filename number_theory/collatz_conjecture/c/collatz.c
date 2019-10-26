#include <stdio.h>
#include <stdlib.h>

void collatz(int x){
    if(x <= 0) return;
    printf("%d\n",x);
    if(x == 1) return;
    collatz(x%2?3*x+1:x/2);
}

int main(int argc, char **argv){
    if(argc < 2){
        printf("Usage: %s number\n",argv[0]);
        return EXIT_FAILURE;
    }

    int x = atoi(argv[1]);
    if(x <= 0){
        printf("Ensure the number you entered is greater than 0.\n");
        return EXIT_FAILURE;
    }

    collatz(x);
    return EXIT_SUCCESS;
}


