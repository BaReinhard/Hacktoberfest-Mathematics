from __future__ import print_function
import matplotlib.pyplot as plt
from collections import *
import math
import random
import numpy as np

random.seed()
n = 1000000 #no. of points generated
INF = 50

'''
Returns the probability for a new input. 
This can be replaced by any probability density function of our choice.
Currently it is a normal gaussian distribution
'''
def probBlackBox(x):
	den = 2*math.pi
	den = 1/math.sqrt(den)
	# print(x,den)
	return den*math.exp(-(float(x**2))/2)

if __name__ == '__main__' :
	curr = (random.uniform(0,1)-0.5)*INF #initial point chosen randomly between -25 and 25
	arr = [] #list of all the points visited. Each point can be visited multiple times.
	arr.append(curr)
	for i in xrange(n):
		p = (random.uniform(0,1)-0.5)*INF #generating a new point(state)
		#prop is the probability of choosing a new point p
		if probBlackBox(curr)==0 : #if the probability of the current state is very very low.
			prop = 1
		else : 
			prop = min(1,probBlackBox(p)/probBlackBox(curr))
		randomNo = random.uniform(0,1)
		if(randomNo<=prop): # move to the new state(point) with some probability-prop
			curr = p
		arr.append(curr)

	tmp = defaultdict(int) #maintains a count of occurence of each point
	for i in arr : 
		tmp[i]+=1
	x = []
	y = []
	for i in tmp :
		x.append(i)
		y.append(tmp[i]) 

	# print(x)
	#Plotting the points
	plt.plot(x,y,'ro')
	plt.show()
	arr = np.array(arr)
	print("Expected value : ",np.mean(arr))
	print("Expected variance : ",np.var(arr))

