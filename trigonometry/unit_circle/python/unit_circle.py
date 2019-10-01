import math

theta = int(input('Enter an angle in degrees: '))
rad = math.radians(theta)

x = math.cos(rad)
y = math.sin(rad)

print('The point on the unit circle is (%.2f, %.2f).' % (x, y))
