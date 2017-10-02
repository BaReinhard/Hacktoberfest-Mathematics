a = 0.0
b = 0.0

print("This will find the hypotenuse for a right triangle, given the other two sides lengths.")
#starts program, explains itself
a = float(input("Give the first side length in a number: "))
#this asks for the first input, side a
if a <= 0 or a >= 1000: #this limits the input to a valid number
    a = float(input("That's an inavlid length. Try again: "))
else:
    print("Thank you.")

b = float(input("Give the second side length in a number: "))
#asks for the second side, b
if b <= 0 or b >= 1000:
    b = float(input("That's an inavlid length. Try again: "))
else:
    print("Thank you.")

print("Now that we have the two sides, let's solve it.")

def pythagorean_theorem(x, y):
    c_side = 0.0
    c_side = ((x ** 2) + (y ** 2))
    c_side = c_side**(1/2.0)
    return c_side

solution = str(pythagorean_theorem(a, b))

print("The length of the hypotenuse is " + solution)
