def cross(a, b):
	c = [a[1]*b[2] - a[2]*b[1],
		 a[2]*b[0] - a[0]*b[2],
		 a[0]*b[1] - a[1]*b[0]]
	return c

def dot(a, b):
	c = (a[0]*b[0] + a[1]*b[1] + a[2]*b[2])
	return c