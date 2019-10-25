def fib(n):
    if n == 1 or n == 0:
        return n
    return fib(n-1) + fib(n-2)

def test():
    for i in range(20):
        print(fib(i), end = '')
        if i < 19:
            print(', ', end='')
    print()

if __name__ == '__main__':
    test()
