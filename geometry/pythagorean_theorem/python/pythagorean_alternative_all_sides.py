from math import sqrt

def pythagoras(a, b, c):
    
    if a == "?": # If the program is to calculate side a
        ans = c**2 - b**2 # Calculate a^2
        return sqrt(ans); # Return Square Root

    elif b == "?": # If the program is to calaculate side b
        ans = c**2 - a**2 # Calculate b^2
        return sqrt(ans); # Return Square Root

    elif c == "?": # If the pprogram is to calculate side c
        ans = a**2 + b**2 # Calculate c^2
        return sqrt(ans); # Return Square Root

    else:
        return "There was an error with the inputted data." # Return invalid data response
