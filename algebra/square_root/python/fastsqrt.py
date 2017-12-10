'''

Created For DigitalOcean's Hacktoberfest!
A QUICK AND APPROXIMATE SQUARE ROOT PROGRAM

'''

def quickroot(num):
    num = float(num)
    i = 0
    while True:
        if (num < i*i):
            closestsquare = (i-1) * (i-1)
            difference = (num) - closestsquare
            root = (i-1) + (difference / (2 * num))
            return root
        i += 1

# Square root using newton's method
# gives quadratic rate of convergence
def sqrt(num):
    guess = float(num)/2
    epsilon = 0.0000001
    while abs(guess*guess - num) > epsilon:
        guess = (guess + num/guess)/2
    return guess

if __name__ == '__main__':
    print('Square root of 2 is approximately %f'%(quickroot(2)))
    print('Square root of 2 is %f'%(sqrt(2)))
