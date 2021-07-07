#python 2.7
#
#    "finding distance between tow point in a 2d-plane"
#

#getting coordinates from user input
from math import sqrt

x1 = int(raw_input("input first x coordinate: "))
x2 = int(raw_input("input second x coordinate: "))

y1 = int(raw_input("input first y coordinate: "))
y2 = int(raw_input("input second y coordinate: "))

#calculating distance between points

distance = float(sqrt((x2-x1)**2 + (y2-y1)**2))

print "The distance between point(%d,%d) and (%d,%d) is %r" % (x1,x2,y1,y2,distance)