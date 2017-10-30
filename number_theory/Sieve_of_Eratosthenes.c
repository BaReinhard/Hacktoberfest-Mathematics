#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int main (int argc, char **argv){
	int i, j, k, klinha, alterou = 0, *primos;

	scanf("%d", &k);
    klinha = (int) floor(sqrt(k));
	primos = (int*) malloc(sizeof(int)*k);
	for(i = 0; i < (k-1); i++){
        primos[i] = 2 + i;
        printf("%d ", primos[i]);
    }
    for(i = 0; i <= klinha; i++){
        if(primos[i] != 0){
            for(j = i+1; j < (k-1); j++){
                if((primos[j] != 0)&&(primos[j]%primos[i] == 0)){
                    primos[j] = 0;
                    alterou = 1;
                }
            }
            if(alterou){
                printf("\n");
                for(j = 0; j < (k-1); j++)
                    if(primos[j] != 0)
                        printf("%d ", primos[j]);
            }
            alterou = 0;
        }
    }

    free(primos);
    return 0;
}
