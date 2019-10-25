def is_prime(n):
    """Returns True if n is prime"""
    if n <= 1: return False
    if n == 2: return True
    if n == 3: return True
    if n % 2 == 0: return False
    if n % 3 == 0: return False

    i = 5
    w = 2
    while i * i <= n:
        if n % i == 0: return False
        i += w
        w = 6 - w
		
    return True