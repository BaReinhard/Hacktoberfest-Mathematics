def arithmetic_progression():
    inp = raw_input('enter the numbers: ').split(' ')
    if not len(inp) == 3:               # in case of invalid input
        return arithmetic_progression() # prompt user to enter numbers again

    a = float(inp[0])
    d = float(inp[1])
    n = float(inp[2])

    s = ( (2 * a) + ((n - 1) * d) ) * (n / 2)

    print('Sum to n terms of given AP is: ' + str(s))

arithmetic_progression()