"""
    euclid_gcd(0 is used to find the gcd of two numbers using euclidean algorithm
    @input: a, b numbers
    @output gcd(a,b)
"""

def euclid_gcd(a, b):
    
    if a == 0:
        return b
    
    if b == 0 :
        return a
    
    if a < b:
        return euclid_gcd(b, a)

    while b != 0:
        (a, b) = (b, a%b)

    return a
