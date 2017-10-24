#include <stdio.h>

int main()
{
	int num1, num2;
	printf("Enter number 1: ");
	scanf("%d", &num1);
	printf("Enter number 2: ");
	scanf("%d", &num2);

	if ((num1==0) || (num2==0)) {
		return 0;
	}
	else {
		for (int i = num2; i > 0; i--) {
			if ((num1%i==0) && (num2%i==0)) {
				printf("%d\n", i);
				break;
			}
		}
	}
	return 0;
}
