import math

# General
def calculate_distance(u, v):
    """Distance between points u and v.
    Usage: calculate_distance( (1,1), (2,2) ) # outputs sqrt(2)
    :param u: First point (x, y)
    :param v: Second point (x, y)
    """
    return math.sqrt( (u[0]-v[0])**2 + (u[1]-v[1])**2 )

# Areas
def square_area(a):
    """Area of a square.
    Usage: square_area( 3 ) # outputs 9
    :param a: Edge length.
    """
    return a**2

def rectangle_area(b, h):
    """Area of a rectangle.
    Usage: rectangle_area( 3, 5 ) # outputs 15
    :param b: Base length.
    :param h: Height length.
    """
    return b*h

def triangle_area(b, h):
    """Area of a triangle.
    Usage: triangle_area( 3, 5 ) # outputs 15
    :param b: Base length.
    :param h: Height length.
    """
    return b*h/2

def trapezoid_area(B, b, h):
    """Area of a trapezoid.
    Usage: trapezoid_area( 5, 3, 7 ) # outputs 28
    :param a: First base length.
    :param b: Second base length.
    :param h: Height length.
    """
    return (a+b)*h/2