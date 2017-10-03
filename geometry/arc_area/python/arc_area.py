import math

"""
    arc_area
    @input: radius of circle, angle of arc
    @output: area of arc
"""
def arc_area(radius, angle):
    area = (float(angle)/360)*(math.pi*(float(radius)**2))
    return area