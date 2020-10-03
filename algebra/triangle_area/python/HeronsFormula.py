import math

a = input("Enter the first side of sides of the triangle")
b = input("Enter the second side of sides of the triangle")
c = input("Enter the third side of sides of the triangle")

s = (a+b+c)/2
area = math.sqrt(s*(s-a)*(s-b)*(s-c))

print("area is :",area)