import math

"""
    arc_angle
    @input: radius of circle, length of arc
    @output: angle of arc
"""
def arc_angle(arc_len, radius):
    angle = (360*float(arc_len))/(math.pi*2*float(radius))
    return angle