import math

def calculate_distance(u, v):
    """Distance between points u and v, where u and v are points in n dimensional
    space, denoted by lists/tuples/arrays.
    Usage: calculate_distance( <first point>, <second point>)
    """

    if len(u) != len(v):
        raise ValueError('Dimensionality of points doesn\'t match')

    retVal = 0
    for i in xrange(len(u)):
        retVal += (u[i] - v[i])**2

    return math.sqrt(retVal)