'''
Returns the n-th number of the Fibonacci Sequence
'''

def fib(n):
  a, b = 1, 0
  
  while n >= 0:
    temp = a
    a = a + b
    b = temp
    n -= 1
  
  return b
