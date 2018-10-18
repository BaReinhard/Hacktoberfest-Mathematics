#Acceleration is the rate of change of velocity with time.

def CalcAccel(u, v, t):
    ''' u - Initial Velocity in meter/second
        v - Final Velocity in meter/second
        t - Time taken in seconds
        return acceleration in meter/second^2
    '''
    return (v - u) / t

if __name__ == "__main__":
    #example use
    print(CalcAccel(20,50,3))
