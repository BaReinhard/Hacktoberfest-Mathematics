from random import randint

n = int(input())
k = 1

def witness(n, r, d):
    a = randint(2, n - 2)
    #Modular exponentiation <=> a**d % n
    x = pow(a, d, n)
    if x == 1 or x == n - 1:
        return True
    for b in range(r - 1):
        x = pow(x, 2, n)
        if x == 1:
            return False # Number is composite
        if x == n - 1:
            return True

def miller_rabin(n, k):
    #n is the number we want to check if it's probably prime
    #k determines the accuracy of the test, higher is better
    #Check some base cases first
    if n < 2:
        return False
    if n < 4:
        return True

    #Write n-1 as 2**r * d
    d = n - 1
    r = 0
    while d % 2 == 0:
        d //= 2
        r += 1
    for _ in range(k):
        if not witness(n, r, d):
            return False
    return True

print("{} is probably prime.".format(n) if miller_rabin(n, k) else "{} is not prime.".format(n))
