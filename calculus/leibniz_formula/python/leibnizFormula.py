#Estimation of PI using Leibniz formula
def pi(terms):
    try:
        terms = int(terms)
    except ValueError:
        return False
    extimatedValue = 0.0
    for i in range(terms):
        extimatedValue += (((-1.0)**i) / ((2.0*i) + 1))
    
    return extimatedValue * 4