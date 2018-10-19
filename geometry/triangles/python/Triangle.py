from math import sin, sqrt, radians

def area(base, height):
	return (base*height)/2

def angleArea(side1, side2, degrees):
	return (side1*side2*sin(radians(degrees)))/2
	
def heron(side1, side2, side3):
	s = (side1+side2+side3)/2
	return sqrt(s*(s-side1)*(s-side2)*(s-side3))
