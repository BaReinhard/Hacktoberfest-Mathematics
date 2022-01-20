#!/usr/bin/env python3

from math import acos, sqrt, pi, atan
from fractions import Fraction

def primefac(n):
    if n < 1:
        return n
    primfac = []
    d = 3

    while n % 2 == 0:
        primfac.append(2)
        n //= 2

    while d*d <= n:
        while (n % d) == 0:
            primfac.append(d)
            n //= d
        d += 2
    if n > 1:
       primfac.append(n)
    return primfac

def prettier_root(arr):
    d = {}
    for i in list(set(arr)):
        d[i] = arr.count(i)
    whole, frac = 1, 1
    for i in list(set(arr)):
        whole *= i ** (d[i] // 2)
        frac *= i * (d[i] % 2) or 1
    if frac == 1:
        return whole
    elif whole == 1:
        return '√'+ str(frac)
    else:
        return '{}√{}'.format(whole, frac)

def to_polar(c):
    real, imag = c
    r = sqrt(real ** 2 + imag ** 2)
    r_ = prettier_root(primefac(round(real ** 2 + imag ** 2)))
    phi = atan(imag / real) / pi if real > 0 else atan(imag / real) / pi + 1
    # phi = asin(imag / r) / pi
    a, b = str(Fraction(str(phi)).limit_denominator()).split('/')
    if a == '1':
        a = 'π'
    elif a == '-1':
        a = '-π'
    else:
        a += 'π'
    # print(a, b)
    phi_ = '{}/{}'.format(a, b)
    print('{}(cos({})+isin({}))'.format(r_, phi_, phi_))
