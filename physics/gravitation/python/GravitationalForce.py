
# Python code to find Gravitational Force 
def force(m1, m2, r): 
    G = 6.673*(10**-11) 
    F = (G*m1*m2)/(r**2) 
    # Rounding to two digits after decimal 
    return round(F, 2)

#Kinetic energy
def ke(m1, m2, r):
	G = 6.673*(10**-11)
	Ke = (G*m1*m2)/(2*r)
	return round(Ke, 2)

#Potential energy
def pe(m1,m2,r):
	G = 6.673*(10**-11)
	Pe = -(G*m1*m2)/r
	return round(Ke, 2)