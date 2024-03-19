from math import sqrt
K=8987551788

#Vector operations:
def differenceVec(r1,r2): #Returns r1-r2
	if len(r1) != len(r2):
		print("Position Vectors are of an inconsistent dimension")
	else:
		for i in range(len(r1)):
			r1[i]-=r2[i]
	return r1
	
def magnitude(r):
	result=0
	for i in range(len(r)):
		result+=r[i]**2
	return sqrt(result)
	
#Takes two charges q1,q2 (C) and two position vectors (m) in the form of tuples/lists and returns the electrical force (N) as a tuple
def electricalForceVec(q1,q1,r1,r2):
	if len(r1) != len(r2):
		print("Position Vectors are of an inconsistent dimension")
		return 0
	else:
		r=differenceVec(r1,r2)
		distance=magnitude(r)
		forceMag=K*q1*q2/(distance**3)
		for i in range(len(r)):
			r[i]*=forceMag
		return r
		
#q=charge of point charge, r1=position vector of q, r2=position vector of arbitrary point at which point the field vector will be returned
def electricalFieldVec(q,r1,r2):
	if len(r1) != len(r2):
		print("Position Vectors are of an inconsistent dimension")
		return 0
	else:
		r=differenceVec(r1,r2)
		distance=magnitude(r)
		fieldMag=K*q/(distance**3)
		for i in range(len(r)):
			r[i]*=fieldMag
		return r
