import math

def cone_volume(radius, height):
    return (1./3)*math.pi*height*(radius**2)

def cube_volume(edge_len):
    return edge_len**3
    
def cuboid_volume(width, length, height):
    return width*length*height    
    
def cylinder_volume(radius, height):
    return math.pi*height*(radius**2)

def pyramid_volume(width, length, height):
    return (1./3)*width*length*height
    
def sphere_volume(radius):
    return (4./3)*math.pi*(radius**2)
