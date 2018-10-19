import math
from decimal import Decimal

'''
	This method is used to calculate the approximate factorial of large number using stirling approximation
'''

def fact(n):
	d = Decimal(n)
	return (Decimal(2**math.pi)*d).sqrt() * (d / Decimal(math.e)) ** d

