import math

def cone_area(radius, height):
    return math.pi*radius*(radius + math.sqrt( (height**2) + (radius**2) ))

def cube_area(width):
    return 6*(width**2)
    
def cuboid_area(width, length, height):
    return 2*width*length + 2*length*height + 2*width*height    
    
def cylinder_area(radius, height):
    return 2*math.pi*(radius**2) + 2*math.pi*radius*height

def pyramid_area(width, length, height):
    return width*length + length*math.sqrt( (width/2.)**2 + (height**2) ) + width*math.sqrt( (length/2.)**2 + (height**2) )
    
def sphere_area(radius):
    return 4*math.pi*(radius**2)
