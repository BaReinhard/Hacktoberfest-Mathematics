#include <stdio.h>

int main(){
  float num1, num2;

  printf("Enter the first number:\n");
  scanf("%f", &num1);
  printf("Enter the second number:\n");
  scanf("%f", &num2);
  printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
  return 0;
}