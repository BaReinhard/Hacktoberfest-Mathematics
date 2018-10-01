import math

def unit_circle(x, y):
    """
    Determines an angle, theta, in radians given the x and y-coordinates of a point.
    """
    return math.atan(y/x)

def test(x, y, expect):
    assert round(unit_circle(x, y), 3) == round(expect, 3)

test(1, 1, math.pi / 4)
test(420, 420, math.pi / 4)
test(math.sqrt(3), 1, math.pi / 6)
test(1, math.sqrt(3), math.pi / 3)
