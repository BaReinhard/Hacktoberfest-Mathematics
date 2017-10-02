import unittest
from decimal import Decimal
from itertools import product
from .riemann import riemann_sum as riemann

# Test functions
# lowercase are functions, uppercase are their antiderivatives assuming C = 0.
def f1(x):
	return 0

def F1(x):
	return 0

def f2(x):
	return 3

def F2(x):
	return 3 * x

def f3(x):
	return x

def F3(x):
	return x ** 2 / 2

def f4(x):
	return 8 * x

def F4(x):
	return 4 * x ** 2

def f5(x):
	return 6 * x ** 2

def F5(x):
	return 2 * x ** 3

class RiemannTests(unittest.TestCase):
	_tolerance = Decimal('0.01')
	_dx = Decimal('0.00001')
	def test_riemann_sum(self):
		functions = [(f1, F1), (f2, F2), (f3, F3), (f4, F4), (f5, F5)]
		test_points = [
			(0, 1), # Simplest case for most functions
			(0, 3), # From zero
			(-2, 0), # To zero
			(4, 10), # Detatched from zero, positive
			(-10, -4), # Detatched from zero, negative
			(-5, 7) # Across zero
		]
		for (func, antiderivative), (x1, x2) in product(functions, test_points):
			with self.subTest(function=func.__name__, x1=x1, x2=x2):
				actual = riemann(func, x1, x2, self._dx)
				expected = Decimal(antiderivative(x2) - antiderivative(x1))
				self.assertAlmostEqual(actual, expected, delta=self._tolerance)
		
		for (func, antiderivative), (x1, x2) in product(functions, [tuple(reversed(bounds)) for bounds in test_points]): # Test again with x1 and x2 switched
			with self.subTest(function=func.__name__, x1=x1, x2=x2):
				actual = riemann(func, x1, x2, self._dx)
				expected = Decimal(antiderivative(x2) - antiderivative(x1))
				self.assertAlmostEqual(actual, expected, delta=self._tolerance)

