import math
print('Calculates arc lenght of 1 to 5 degree polynomial:')
print('p(x) = a5x^5 + a4x^4 + a3x^3 + a2x^2 + a1x +a0')
a5 = float(input('Insert a5 value:'))
a4 = float(input('Insert a4 value:'))
a3 = float(input('Insert a3 value:'))
a2 = float(input('Insert a2 value:'))
a1 = float(input('Insert a1 value:'))
a0 = float(input('Insert a0 value:'))
print('Insert interval:')
print('[x0  x1]')
interval_0 = float(input('Insert x0:'))
interval_1 = float(input('Insert x1:'))
accuracy = float(input('Insert accuracy value in decimal:'))
n = 1
accuracy_calc = 1
lenght_old = 0
while accuracy_calc >= accuracy:
    lenght_total = 0
    x = interval_0
    i = 0
    while i < n:
        y = a5*(x**5) + a4*(x**4) + a3*(x**3) + a2*(x**2) + a1*x + a0
        x_new = x + abs((interval_1 - interval_0)/n)
        y_new = a5*(x_new**5) + a4*(x_new**4) + a3*(x_new**3) + a2*(x_new**2) + a1*x_new + a0
        lenght = math.sqrt(((interval_1 - interval_0)/n)**2 + (y_new - y)**2)
        x = x_new
        lenght_total += lenght
        i = i + 1
    n = n + 1
    accuracy_calc = lenght_total - lenght_old
    lenght_old = lenght_total
print('The arc lenght value is: {}'.format(lenght_total))
