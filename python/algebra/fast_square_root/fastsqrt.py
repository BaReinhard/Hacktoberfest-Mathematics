'''

Created For DigitalOcean's Hacktoberfest!
A QUICK AND APPROXIMATE SQUARE ROOT PROGRAM

'''

def quickroot(num):

    i = 0

    while True:

        if (num < i*i):
            closestsquare = (i-1) * (i-1)
            difference = (num) - closestsquare
            root = (i-1) + (difference / (2 * num))
            return root

        i += 1


