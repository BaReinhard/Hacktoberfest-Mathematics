a, b, c = list(map(int, input('Enter three sides pf triangle: ').split(',')))

s = (a+b+c)/2

area = (s*(s-a)*(s-b)*(s-c))**0.5
print(area)
