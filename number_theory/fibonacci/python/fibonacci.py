""" Fibonacci function with memoization """


def memoize(func):
    """ Memoization function """
    memory = {}

    def memo(*args):
        """ Inner memoization function """
        if args in memory:
            return memory[args]
        result = func(*args)
        memory[args] = result
        return result

    return memo


@memoize
def fibonacci(n):
    """ Fibonacci function """
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)
