#include <stdio.h>

int main(){
  int num1, num2;

  printf("Enter the first number:\n");
  scanf("%d", &num1);
  printf("Enter the second number:\n");
  scanf("%d", &num2);
  printf("%d + %d = %d\n", num1, num2, num1+num2);
  return 0;
}