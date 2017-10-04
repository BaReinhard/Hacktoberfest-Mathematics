def bezout(a, b, x = 0, prev_x = 1, y = 1, prev_y = 0):
	""" Calculate the Bézout's identity of 'a' and 'b' recursively
		Using the extended euclidean algorithm
	"""

	# 'a' has to be greater than 'b'
	if b > a:
		a, b = b, a

	# calculate the remainder of a/b
	remainder = a % b

	# if remainder is 0, stop here : gcd found
	if remainder == 0:
		return b, x, y

	# else, update x and y, and continue
	quotient = a // b
	prev_x, prev_y, x, y = x, y, quotient*x + prev_x, quotient*y + prev_y
	return bezout(b, remainder, x, prev_x, y, prev_y)
