from decimal import Decimal
from enum import Enum
from functools import partial
from numbers import Real
from typing import Callable, Union

number_arg = Union[Real, str] # Decimals can take any number, or a string
math_function = Callable[[Decimal], number_arg]

class RiemannMethod(Enum):
	@partial # This makes the function definition a `partial`, not a function, so the Enum recognizes it as a value instead of a method.
	def left(self, func: math_function, x: Decimal, dx: Decimal):
		return Decimal(func(x)) * dx
	
	@partial
	def right(self, func: math_function, x: Decimal, dx: Decimal):
		return Decimal(func(x + dx)) * dx
	
	@partial
	def middle(self, func: math_function, x: Decimal, dx: Decimal):
		return Decimal(func(x + dx/2)) * dx
	
	@partial
	def trapezoid(self, func: math_function, x: Decimal, dx: Decimal):
		return Decimal(func(x) + func(x + dx)) / 2 * dx
	
	def __call__(self, *args, **kwargs):
		return self.value(self, *args, **kwargs)

def riemann_sum(func: math_function, x1: number_arg, x2: number_arg, dx: number_arg, method: RiemannMethod = RiemannMethod.left):
	accum = Decimal(0)
	x1, x2, dx = map(Decimal, (x1, x2, dx)) # Convert all arguments to decimal for accuracy
	if x1 > x2:
		dx = -dx
		running = x2.__lt__
	else:
		running = x2.__gt__
	x = x1
	while running(x):
		accum += method(func, x, dx)
		x += dx
	return accum
