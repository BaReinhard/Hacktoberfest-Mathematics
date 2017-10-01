import math

# General
def distance_2d_points(u, v):
    """Distance between points u and v.
    Usage: distance_2d_points( (1,1), (2,2) ) # outputs sqrt(2)
    :param u: First point (x, y)
    :param v: Second point (x, y)
    """
    return math.sqrt( (u[0]-v[0])**2 + (u[1]-v[1])**2 )

def distance_3d_points(u, v):
    """Distance between points u and v.
    Usage: distance_3d_points( (1,1,1), (2,2,2) ) # outputs sqrt(3)
    :param u: First point (x, y)
    :param v: Second point (x, y)
    """
    return math.sqrt( (u[0]-v[0])**2 + (u[1]-v[1])**2 + (u[2]-v[2])**2 )