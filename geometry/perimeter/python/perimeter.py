import math

def circle_perimeter(radius):
    return math.pi * 2 * radius

def square_perimeter(side):
    return 4 * side

def rectangle_perimeter(length, width):
    return 2 * (length + width)

def triangle_perimeter(s1, s2, s3):
    return s1 + s2 + s3

def parallelogram_perimeter(s1, s2, s3, s4):
    return s1 + s2 + s3 + s4

def trapezoid_perimeter(height, base1, base2):
    return height * ((base1+base2)/2)

def polygon_perimeter(sides):
    res = 0
    for side in sides:
        res += side
    return res