import math
from math import pi, sin, cos

def polar_to_cartesian(radius, degrees):
  r = float(radius)
  d = float(degrees)

  theta = d*pi/180

  x = r*cos(theta)
  y = r*sin(theta)
  return x,y
  
def cartesian_to_polar(x, y):
  x = float(x)
  y = float(y)

  r = math.sqrt(x*x + y*y)
  theta = math.atan2(y, x)
  return r, theta
