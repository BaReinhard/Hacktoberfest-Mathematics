from decimal import Decimal
from numbers import Real
from typing import Callable, Union

number_arg = Union[Real, str] # Decimals can take any number, or a string

def riemann_sum(func: Callable[[Decimal], number_arg], x1: number_arg, x2: number_arg, dx: number_arg):
	accum = Decimal(0)
	x1, x2, dx = map(Decimal, (x1, x2, dx)) # Convert all arguments to decimal for accuracy
	if x1 > x2:
		dx = -dx
		running = x2.__lt__
	else:
		running = x2.__gt__
	x = x1
	while running(x):
		y = Decimal(func(x))
		accum += y * dx
		x += dx
	return accum
