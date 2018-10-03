def sum (a, r, n):
    if (r==1):
        return a*n
    else:
        return a*((r**n)-1)/(r-1)

def nthTerm (a, r, n):
    return a*(r**(n-1))


