  # Module recieves a number
  # Returns n * (n-1)
  # If n = 0, returns 1 and ends recursion

def factorial(n):
	if n == 0:				
		return 1			
	else:
		return n * factorial(n-1)
