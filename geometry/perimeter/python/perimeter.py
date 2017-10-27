def perimeter(a, b, c):
  #calculate perimeter
  perim = a + b + c
  return perim
  
def main():
    a = int(input('First side: '))
    b = int(input('Second side: '))
    c = int(input('Third side: '))
    
print "Perimeter is {}."format(
  perimeter(a, b, c)
  )

#output : perimeter is [number]
