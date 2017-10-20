def point_in_polygon(point, polygon):
    """
    Determines if a point is inside a given polygon or not. A polygon is a list of (x, y) tuples

    .. note::
        This algorithm has been obtained from the following source,
        http://web.archive.org/web/20091004071251/http://local.wasp.uwa.edu.au/~pbourke/geometry/insidepoly/

    .. note::
        Code obtained from http://www.ariel.com.au/a/python-point-int-poly.html
        Code was cleaned up and made a little flatter and more pythonic

    :param tuple point: Coordinate of point in metric coordinates (x, y)
    :param list polygon: Set of points that form a polygon [(x1,y1), (x2,y2) ...]
    :return: If point is inside or outside the polygon
    :rtype: bool
    """
    x, y = point
    is_inside = False
    p1x, p1y = polygon[0]
    no_of_points = len(polygon)

    for i in range(no_of_points + 1):
        p2x, p2y = polygon[i % no_of_points]
        if min(p1y, p2y) < y <= max(p1y, p2y) and x <= max(p1x, p2x):
            if p1y != p2y:
                xinters = (y - p1y) * (p2x - p1x) / (p2y - p1y) + p1x
            if p1x == p2x or x <= xinters:
                is_inside = not is_inside
        p1x, p1y = p2x, p2y

    return is_inside
