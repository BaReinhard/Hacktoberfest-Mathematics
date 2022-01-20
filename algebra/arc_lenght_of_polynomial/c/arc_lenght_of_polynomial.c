#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){
	int i, n;
	double a0, a1, a2, a3, a4, a5, interval_0, interval_1;
	double x, y, x_new, y_new;
	double lenght, lenght_old = 0, lenght_total;
	double accuracy_calc, accuracy;

	printf("Calculates arc lenght of 1 to 5 degree polynomial\n");
	printf("p(x) = a5x^5 + a4x^4 + a3x^3 + a2x^2 + a1x +a0\n");
	printf("Insert a5 value:");
    scanf("%lf", &a5);
	printf("Insert a4 value:");
    scanf("%lf", &a4);
	printf("Insert a3 value:");
    scanf("%lf", &a3);
	printf("Insert a2 value:");
    scanf("%lf", &a2);
	printf("Insert a1 value:");
    scanf("%lf", &a1);
	printf("Insert a0 value:");
    scanf("%lf", &a0);
	printf("Insert interval:\n");
	printf("[x0  x1]\n");
	printf("Insert x0:\n");
    scanf("%lf", &interval_0);
	printf("Insert x1:\n");
    scanf("%lf", &interval_1);
	printf("Insert accuracy value in decimal:\n");
    scanf("%lf", &accuracy);

	n = 1; 

	do { 
		lenght_total = 0; 
		x = interval_0; 

		for(i = 0; i < n; i++){ 
			x_new = x + fabs((interval_1 - interval_0)/n); 

			y = a5*pow(x, 5) + a4*pow(x, 4) + a3*pow(x, 3) + a2*pow(x, 2) + a1*x + a0; 
			y_new = a5*pow(x_new, 5) + a4*pow(x_new, 4) + a3*pow(x_new, 3) + a2*pow(x_new, 2) + a1*x_new + a0; 
			lenght = sqrt(pow((interval_1 - interval_0)/n, 2) + pow(y_new - y, 2)); 
			x = x_new; 
			lenght_total += lenght; 
		}
		n++; 
		accuracy_calc = lenght_total - lenght_old; 
		lenght_old = lenght_total; 
	} while (accuracy_calc >= accuracy); 

	printf("The arc lenght value is: %lf", lenght_total); 

return 0;
}
