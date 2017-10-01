import math

def triangle_area(base, height):
    return (1./2) * base * height

def square_area(edge_len):
    return edge_len**2
    
def rectangle(width, length):
    return length * height    
    
def ellipse(a, b):
    return math.pi * a * b

def trapezoid(base_one, base_two, height):
    return 0.5 * (base_one + base_two) * height
    
def circle(radius):
    return math.pi * (radius**2)
