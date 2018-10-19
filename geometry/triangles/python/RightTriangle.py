from math import sqrt, pow, sin, cos, tan

def hypotenuseLength(side1, side2):
	return sqrt(pow(side1, 2) + pow(side2, 2))

def findMissingLength(hypotenuse, side1):
	return sqrt(pow(hypotenuse, 2) - pow(side1, 2))

def sohcahtoa(adjacent, opposite, hypotenuse):
	a=[]
	a.append(sin(opposite/hypotenuse))
	a.append(cos(adjacent/hypotenuse))
	a.append(tan(opposite/adjacent))
	return a
	
