import math

def calculate_distance(u, v):
    """Distance between points u and v
    Usage: calculate_distance( (1,1), (2,2) ) # sqrt(2)
    """
    return math.sqrt( (u[0]-v[0])**2 + (u[1]-v[1])**2 )


def calculate_distance(x1, y1, x2, y2):
    """Distance between points x and y
    Usage calculate_distance(1,1,2,2)
    """
    return math.sqrt((x1-x2)**2 + (y1-y2)**2)
