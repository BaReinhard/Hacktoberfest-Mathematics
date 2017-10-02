import math

"""
    arc_length
    @input: radius of circle, angle made by arc at center
    @output: length of arc
"""
def arc_length(radius, angle):
    arc_length = (math.pi*2*float(radius))*(float(angle)/360)
    return arc_length

"""
    arc_angle
    @input: radius of circle, length of arc
    @output: angle of arc
"""
def arc_angle(arc_len, radius):
    angle = (360*float(arc_len))/(math.pi*2*float(radius))
    return angle

"""
    arc_area
    @input: radius of circle, angle of arc
    @output: area of arc
"""
def arc_area(radius, angle):
    area = (float(angle)/360)*(math.pi*(float(radius)**2))
    return area
