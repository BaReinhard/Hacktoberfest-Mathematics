"""
    euclid_gcd() is used to find the gcd of two numbers using euclidean algorithm
    @input: a, b numbers
    @output gcd(a,b)
"""

def euclid_gcd(a, b):
    if a < b:
        return euclid_gcd(b, a)

    while b != 0:
        (a, b) = (b, a%b)

    return a
"""
    lcm() is used to return the least common multiple between two numbers
    @input: a, b numbers
    @output: lcm(a, b)
"""

def lcm(a, b):
    gcd = euclid_gcd(a, b)
    return (a*b)/gcd
