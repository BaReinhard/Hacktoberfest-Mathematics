import math   # used for exponential functions
def newton_raphson(function, derivative_function, starting_value, accuracy):
  result = float(starting_value)
  while True:
    next_result = result - (function(result) / derivative_function(result))
    difference = abs(next_result - result)
    scaled_difference = difference * 10**accuracy
    
    if scaled_difference < 1:
      break
    
    result = next_result
    
  return round(result, accuracy)
  
  
  
f = lambda x: x**3 - 8    # function to find roots of
df = lambda x: 3*(x**2)   # derivative of the function
  
print newton_raphson(f, df, 7, 5)
