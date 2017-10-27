def fibonacci(n):
    if n < 0:
        return -1
    if n == 0 or n == 1:
        return 1
    a, b = 1, 1
    for i in range(n-2):
        a, b = b, a+b
    return b
