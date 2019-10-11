
import math
def areaFromSides(a,b,c):
	s = (a+b+c)/2
	return math.sqrt(s*(s-a)*(s-b)*(s-c));

print('Enter the three sides of the triangle :')
a = int(input())
b = int(input())
c = int(input())
print('The area of the triangle is {}'.format(areaFromSides(a,b,c)))
