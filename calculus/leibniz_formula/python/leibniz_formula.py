
def pi(terms):
    result = 0
    for i in range(terms):
	result += 4 * (-1) ** i * (1 / (2.0 * i + 1))
    return result
