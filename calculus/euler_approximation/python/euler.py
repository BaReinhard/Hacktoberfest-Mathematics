print('Enter lower bound')
LOW_BOUND = int(input())
print('Enter higher bound')
HIGH_BOUND = int(input())
h = 0.125

def func(x,y):
	return 3*(x+y);

a = int((HIGH_BOUND-LOW_BOUND)//h) + 1
x = [0.0]
y = [1.0]
for i in range(0,a):
	x.append(x[i] + h)
	y.append(y[i] + h*func(x[i],y[i]))

print(" x[i]\t y[i]\n")
for i in range(0,a):
	print("{0:.4f}\t{0:.4f}\n".format(x[i],y[i]))

