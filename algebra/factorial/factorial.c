#include <stdio.h>

factorial(int);

int main(){
	int usr_input = 0;
	int i;
	unsigned long long factorial = 0;
	printf("Enter a positive number: \n");
	scanf("%d", &usr_input);
	if(usr_input == 0){
		printf("The factorial of 0 is 1");
	} else {
		for(i = 1; i <= usr_input; i++){
			factorial *= i;
		}
		printf("The factorial of %d is %llu\n", usr_input, factorial);	
	}
	return 0;
}


