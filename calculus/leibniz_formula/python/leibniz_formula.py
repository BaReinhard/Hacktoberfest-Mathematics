# Estimation of PI using Leibniz formula
from math import pow

def pi(terms):
    acc = 0
    for x in range(0, terms):
        acc += pow(-1, x) / (2 * x + 1)
    return acc * 4
