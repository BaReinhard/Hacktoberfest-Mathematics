n = int(input('Enter the amount of sides in the polygon: '))

while n < 3:
  print('Please enter a number larger than 3.')
  n = int(input('Enter the amount of sides in the polygon: '))

s = int(input('Enter the length of each side of the polygon: '))

print('The perimeter of the polygon is', n * s)
