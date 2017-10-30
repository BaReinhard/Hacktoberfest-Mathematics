def fib(n):
    a, b = 0, 1
    if n == 0:
        return a # fib(0)
    if n == 1:
        return b # fib(1)
    for i in range(n-1):
        a, b = b, a + b
    return b

if __name__ == '__main__':
    assert fib(0) == 0
    assert fib(1) == 1
    assert fib(20) == 6765
