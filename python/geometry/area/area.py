import math

###################################################################
# 2D
###################################################################
def square_area(edge):
    """Area of a square. Usage: square_area( 3 ) # outputs 9
    :param edge: Edge length.
    """
    return edge**2
    
def rectangle_area(width, height):
    """Area of a rectangle. Usage: rectangle_area( 3, 5 ) # outputs 15
    :param width: Width length.
    :param height: Height length.
    """
    return width * height

def triangle_area(base, height):
    """Area of a triangle. Usage: triangle_area( 3, 5 ) # outputs 7
    :param base: Base length.
    :param height: Height length.
    """
    return base * height * (1./2)
    
def trapezoid_area(base1, base2, height):
    """Area of a trapezoid. Usage: trapezoid_area( 5, 3, 7 ) # outputs 28
    :param base1: First base length.
    :param base2: Second base length.
    :param height: Height length.
    """
    return (base1+base2) * height * (1./2)
    
def circle_area(radius):
    """Area of a circle. Usage: circle_area( 2 ) # outputs 4*pi
    :param radius: Radius length.
    """
    return math.pi * (radius**2)

def ellipse_area(a, b):
    """Area of an ellipse. Usage: ellipse_area( 3, 5 ) # outputs 15*pi
    :param a: Semi-major axis length.
    :param b: Semi-minor axis length.
    """
    return math.pi * a * b


###################################################################
# 3D
###################################################################
def sphere_area(radius):
    """Area of a sphere. Usage: sphere_area( 3 ) # outputs 36*pi
    :param radius: Radius length.
    """
    return 4 * math.pi * (radius**2)

def cylinder_area(base_radius, height):
    """Area of a cylinder. Usage: cylinder_area( 3, 5 ) # outputs 48*pi
    :param base_radius: Base radius value.
    :param height: Height length.
    """
    return 2 * pi * base_radius * ( base_radius + height )

def cube_area(edge):
    """Area of a cube. Usage: cube_area( 3 ) # outputs 54
    :param edge: Edge length.
    """
    return 6 * square_area(edge)