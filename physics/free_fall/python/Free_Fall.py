def height(gravity, seconds):
	h = 0.5 * gravity * pow(seconds, 2)
	return h
def velocity(gravity, seconds):
	v = gravity * seconds
	return v
def time(velocity, gravity):
	t = velocity / gravity
	return t


   
    