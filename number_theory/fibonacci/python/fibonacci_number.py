'''
Returns the n-th number of the Fibonacci Sequence
'''

def fib(n):
  a = 1, b = 0
  
  while n >= 0:
    temp = a
    a = a + b
    b = temp
    n -= 1
  
  return b
