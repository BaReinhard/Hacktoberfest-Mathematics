# G  : gravitational constant (6.67x10**-11)
# F  : force of gravity
# m1 : Mass of the one object
# m2 : Mass of the another object
G=6.673*(10**-11)

def gravity(m1, m2, r):
	F=(G*m1*m2)/(r**2)

	return F

print(gravity(2000000, 500000, 10)) # 0.6673
