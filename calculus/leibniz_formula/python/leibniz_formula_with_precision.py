'''
Calculates an approximation of pi using the series of leibniz, with arbitrary precision. 
It also prints the approximate values of pi calculated at each step up to the final value.
'''

precision = float(raw_input("enter a precision: "))
i, sum, last_sum  = 0, 0, 0
while True:
	sum += 4 * (-1) ** i * (1 / (2.0 * i + 1))
	i += 1
	print '%.6f' % sum
	if abs(sum - last_sum ) < precision:
		break
	last_sum = sum
