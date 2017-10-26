# convertion between degrees and radians:

import math

pi = math.pi


def radians_to_degrees(radians):
	degrees = 180 * radians / pi
	return degrees
    
def degrees_to_radians(degrees):
	radians = pi * degrees / 180
	return radians

print("The conversion of pi/3 radians to degrees is =", radians_to_degrees(pi/3))
print("The conversion of 360 degrees to radians is =", degrees_to_radians(360))
