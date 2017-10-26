# A recursive implementation that finds the nth number in the Fibonnaci sequence
def fibonacci(n):
	return fibonacci_helper(n, {})


# Helps return answers faster by storing previous values in a dynamic lookup dictionary
def fibonacci_helper(n, dlookup):
	if n <= 2:
		return 1
	else:
		n1 = dlookup[n - 1] if n - 1 in dlookup else fibonacci_helper(n - 1, dlookup)
		n2 = dlookup[n - 2] if n - 2 in dlookup else fibonacci_helper(n - 2, dlookup)

		dlookup[n - 1] = n1
		dlookup[n - 2] = n2

		return n1 + n2
