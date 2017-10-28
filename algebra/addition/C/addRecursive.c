#include <stdio.h>
#include <stdlib.h>

int addRecursive(int a, int b);

int main ()
{
    int num1,num2;
    printf("inpunt num 1: "); scanf("%d",&num1);
    printf("inpunt num 2: "); scanf("%d",&num2);

    printf("\n %d + %d = %d",num1,num2,addRecursive(num1,num2));
    return 0;
}

int addRecursive(int a, int b){
    if(b==0){
        return a;
    } else if(b<0){
        return 1-addRecursive(a,b+1);
    } else{
        return 1+addRecursive(a,b-1);
    }

}

