
#include<stdio.h>
int main()
{
  	float x[10], y[10][10], sum, p, u, temp;
  	int i, n, j, k = 0, f, m;
	printf("\nHow many records you will be entering: \n");
  	scanf("%d", &n);
  	for(i = 0; i < n; i++){
		printf("\nEnter the value of x_%d : \n", i);
   		scanf("%f", &x[i]);
   		printf("\nEnter the value of f(x_%d) : \n", i);
   		scanf("%f",&y[k][i]);
  	}
  	printf("\nEnter X for finding f(x): ");
  	scanf("%f", &p);
	for(i = 1; i < n; i++){
        	k = i;
    		for(j = 0; j < n - i; j++){
     			y[i][j] = (y[i - 1][j + 1] - y[i - 1][j]) / (x[k] - x[j]);
     			k++;
    		}
  	}
  	printf("\n____________________________________________________________\n");
  	printf("\n  x(i)\t   y(i)\t      y1(i)     y2(i)     y3(i)     y4(i)");
  	printf("\n____________________________________________________________\n");
  	for(i = 0; i < n; i++){
        	printf("\n %.3f", x[i]);
    			for(j = 0; j < n - i; j++){
     				printf("   ");
     				printf(" %.4f",y[j][i]);
    			}
   		printf("\n");
  	}
  	i = 0;
  	do{
   		if(x[i] < p && p < x[i + 1])
    			k = 1;
   		else
    			i++;
  	}while(k != 1);
  	f = i;
 	sum = 0;	
  	for(i = 0; i < n - 1; i++){
   		k = f;
   		temp = 1;
   		for(j = 0; j < i; j++){
    			temp = temp * (p - x[k]);
   			 k++;
   		}
    		sum = sum + temp * (y[i][f]);
  	}
  	printf("\n\n f(%.4f) = %f \n", p, sum);
	printf("P(n) = ");
	for(i = 1; i < n; i++){
                k = i;
                for(j = 0; j < n - i; j++){
                        y[i][j] = (y[i - 1][j + 1] - y[i - 1][j]) / (x[k] - x[j]);
                        k++;
			printf("(%f) * (x - %f) + ", y[i][j], x[j]);
                }
        }


}
