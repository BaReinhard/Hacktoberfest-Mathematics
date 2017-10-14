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

def cylinder(radius,height):
    return 2.0 * math.pi* radius * height;

def sphere(radius):
    return 4 * math.pi * (radius**2);

def sector(radius,angle):
    return radius*radius*angle*(1./2)
