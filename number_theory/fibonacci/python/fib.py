#  n equals place in fib sequence
#  send n to fibonacci function to get the number from
#  that position in the sequence
#  Written with dynamic programming concept

fib_numbers = [0,1] 
  
def fibonacci(n): 
    if n <= len(fib_numbers): 
        return fib_numbers[n-1] 
    else: 
        temp = fibonacci(n-1) + fibonacci(n-2) 
        fib_numbers.append(temp) 
        return temp 
  
