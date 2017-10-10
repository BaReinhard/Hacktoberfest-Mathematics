##Returns True if the point lies on the circle, else false
def isPointOnCircle(center_x, center_y, radius, point_x, point_y):
    return (point_x-center_x)**2+(point_y-center_y)**2-radius**2==0

##Gets radius of circle with the center coords and the coords of a point on the circle
def getRadius(center_x, center_y, point_x, point_y):
    return ((point_x-center_x)**2+(point_y-center_y)**2)**(1/2)


