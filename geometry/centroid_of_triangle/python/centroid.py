#python 2.7
#
#     "formula for calculating centroid of a triange with known coordinates of sides"
#

#user input

x1 = int(raw_input("input first x coordinate: "))
x2 = int(raw_input("input second x coordinate: "))
x3 =  int(raw_input("input third x coordinate: "))

print "\n"

y1 = int(raw_input("input first y coordinate: "))
y2 = int(raw_input("input second y coordinate: "))
y3 = int(raw_input("input third y coordinate: "))

print "\n"

centroid =  (x1  + x2 + x3)/3 + (y1+y2+y3)/3

print "The centroid of triangle is %r" % centroid