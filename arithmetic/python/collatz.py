#define a function
def collatz(number):
    #if number divisible by two
    #divide it and return the result
    if number % 2 == 0:
        result = number//2
        print(result)
        return result
    #if number is not divisible by two
    #multiply it by 3 and add 1 to it and return the result
    else:
        result = 3*number + 1
        print(result)
        return result
#Ask the input from the user
number = int(input("Enter a number not less than 1: "))
#while the number is greater than 1
#update the value of number with the present result of collatz function
while( number > 1):
    number = collatz(number)
    
