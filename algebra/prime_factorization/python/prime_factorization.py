from math import sqrt

def is_prime(n):
	""" A number is prime if it can be devide only by 1 and himself
		Check from 2 to sqrt(n). After sqrt(n) the numbers are redondant
	"""
	if n == 1:
		return False

	for i in range(2, int(sqrt(n))):
		if n % i == 0:
			return False
	return True

def prime_factorization(n, primes = []):
	""" Find the prime numbers (recursively) so that
		n = p1^a1 * p2^a2 * ... * pn^an
	"""
	if n <= 1:
		return primes

	i = 2
	while not (is_prime(i) and n % i == 0):
		i += 1
	primes.append(i)
	return prime_factorization(n // i, primes)
