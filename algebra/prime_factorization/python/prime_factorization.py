from math import sqrt

def prime_factorization(n, primes = []):
	""" Find the prime numbers (recursively) so that
		n = p1^a1 * p2^a2 * ... * pn^an
	"""
	if n <= 1:
		return primes

	i = 2
	while not n % i == 0:
		i += 1
	primes.append(i)
	return prime_factorization(n // i, primes)
