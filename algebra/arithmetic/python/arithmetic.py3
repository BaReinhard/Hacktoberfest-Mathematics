# importing modules
import math

# defining class arithmetic
# NOTE : THIS WILL NOT ACCEPT -ve NUMBERS
class arithmetic():
    # consttuctor that will take number as argument
    def __init__(self, number):
        self.number = number
        pass

    # method to find square_root
    def square_root(self, dec):  # dec means number of decimal places
        value = math.sqrt(self.number)  # math module defined function to get square_root
        return round(value , dec)  # rounding the square_root upto dec decimal places

    # method to find cube_root - if else is used to check if number is negative then return
    # -ve cube_root else return +ve cube_root
    def cube_root(self, dec):
        value = math.pow(self.number, 1./3.)   # 1./3. will do floating division to get cube root
        if self.number < 0:
            return round(-value, dec)
        else:
            return round(value, dec)
        pass

    # method to find sum of digits
    def digit_sum(self, dec):
        total = 0       # total - sum of digits
        n = self.number   # cloning number

        # loop body will iterate till n > 0
        while(n > 0):
            total +=  n % 10  # aading the previous value of total with remainder of n / 10
            n //= 10   # integer based division to traverse through numbers
            pass
        return total   # returning the sum
    pass


# demo begins her
num = 169  # number on which operations will be occures
decimal_digit = 5  # number of places of decimal

eight = arithmetic(num)   # object of class arithmetic

# displaying results
print("square root of", num, "is", eight.square_root(decimal_digit))
print("cube root of", num, "is", eight.cube_root(decimal_digit))
print("sum of digits of", num, "is", eight.digit_sum(decimal_digit))
