import unittest
from decimal import Decimal
from itertools import product
from .riemann import riemann_sum as riemann, RiemannMethod

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
	tolerance = Decimal('0.005')
	dx = Decimal('0.00001')
	functions = [(f1, F1), (f2, F2), (f3, F3), (f4, F4), (f5, F5)]
	test_points = [
		(0, 1), # Simplest case for most functions
		(0, 3), # From zero
		(-2, 0), # To zero
		(4, 10), # Detatched from zero, positive
		(-10, -4), # Detatched from zero, negative
		(-5, 7) # Across zero
	]
	test_points.extend([tuple(reversed(bounds)) for bounds in test_points]) # List, not generator, to evaluate everything before appending
	def test_riemann_sum(self):
		"""
		Test the riemann_sum function by ensuring its results are within a certain small tolerance of the actual value.
		The tolerance is set above, and used as `self._tolerance`.
		Every function above is tested for every method and every pair of test points, as well as for each pair reversed.
		"""
		for (func, antiderivative), method, (x1, x2) in product(self.functions, RiemannMethod, self.test_points):
			with self.subTest(function=func.__name__, x1=x1, x2=x2, method=method):
				estimate = riemann(func, x1, x2, self.dx, method)
				actual = Decimal(antiderivative(x2) - antiderivative(x1))
				self.assertAlmostEqual(estimate, actual, delta=self.tolerance)
	
	def test_methods(self):
		"""
		Test the different methods of Riemann summing to ensure they exhibit the known errors/biases.
		For example, a left-hand Riemann sum underestimates increasing functions and overestimates decreasing ones.
		"""
		def func(x):
			return x ** 3
		
		def antiderivative(x):
			return x ** 4 / 4
		
		x1, x2, dx = map(Decimal, (-10, 10, '0.5')) # Intentionally large dx to exacerbate over/under-estimation
		actual = Decimal(antiderivative(x2) - antiderivative(x1))
		
		# Because x^3 is always increasing, left-hand should underestimate it.
		estimate_left = riemann(func, x1, x2, dx, RiemannMethod.left)
		self.assertLess(estimate_left, actual)
		
		# Because x^3 is always increasing, right-hand should overestimate it.
		estimate_right = riemann(func, x1, x2, dx, RiemannMethod.right)
		self.assertGreater(estimate_right, actual)
		
		# Because x^3 is rotationally symmetrical about the origin and the input range is symmetrical about the origin, middle and trapezoid should be dead-on.
		estimate_middle = riemann(func, x1, x2, dx, RiemannMethod.middle)
		estimate_trapezoid = riemann(func, x1, x2, dx, RiemannMethod.trapezoid)
		self.assertEqual(estimate_middle, actual)
		self.assertEqual(estimate_trapezoid, actual)
