# Quadratic Equation form: a(x^2) + b(x) + c = 0

def discriminant():
    a = float(input('a: '))
    b = float(input('b: '))
    c = float(input('c: '))
    discriminant = (b**2) - (4*a*c)
    if discriminant > 0:
        print('Two Roots. Discriminant = ', discriminant)
    elif discriminant == 0:
        print('One Rooot. Discriminant = ', discriminant)
    elif discriminant < 0:
        print('No Real Root. Discriminant = ', discriminant)


discriminant()
