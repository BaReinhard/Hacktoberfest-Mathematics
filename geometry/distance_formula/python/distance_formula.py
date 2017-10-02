import math

def calculate_distance(u, v):
    """Distance between points u and v
    Usage: calculate_distance( (1,1), (2,2) ) # sqrt(2)
    """
    return math.sqrt( (u[0]-v[0])**2 + (u[1]-v[1])**2 )