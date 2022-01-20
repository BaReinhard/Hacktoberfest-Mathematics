import math

def triangle_area(a, b, c):
  s = (a + b + c) / 2.0
  area = math.sqrt(s * (s - a) * (s - b) * (s - c))
  return area
  
  
  
  
  
print triangle_area(3, 4, 5)
