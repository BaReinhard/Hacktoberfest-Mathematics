''' n equals place in fib sequence
  send n to fib function to get the number from
  that position in the sequence
'''

def fib(n):
    a = 0
    b = 1

    if n == 0:
        return a
    elif n == 1:
        return b
    else:
        for i in range(2,n):
            temp = a + b
            a = b
            b = temp
        return b


