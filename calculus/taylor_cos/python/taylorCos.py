# A small script to calculate cosine using Taylor expansion

import math

def taylor_cosine(x, n):

    cosine = 0
    
    for counter in range(0, n + 1):
        
       cosine = cosine + (-1)**counter * x**(2 * counter) / (math.factorial(2 * counter))
        
    return cosine

term_limit = int(input("Enter the value of 'n' for Taylor series of cosine(bigger the better): "))
angle = float(input("Enter the angle for calculation: "))

print("Cosine value of " + str(term_limit) + " is:: " + str(taylor_cosine(angle, term_limit)))
