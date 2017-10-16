#include <stdio.h> 
#define LOW_BOUND 0
#define HIGH_BOUND 3
#define h 0.125 
double f(double x, double y);
int main () 
{ 	int a = (int)((HIGH_BOUND - LOW_BOUND) / h) + 1;
	double x[a], y[a]; 
	int i;
	x[0] = 0.0;
	y[0] = 1.0; 
	for (i = 0; i < a; i++){
		x[i + 1] = x[i] + h;
		y[i + 1] = y[i] + h * f(x[i], y[i]);
	} 
	printf("x[i]\ty[i]\n"); 
	for (i = 0; i < a; i++)
		printf("%.4f\t%.4f\n", x[i], y[i]); 
	return 0;
} 
double f(double x, double y) 
{ 
	return(3 * (x + y));
} 
