import sys

def fibonacii(n):
	if n<2:
		return n;
	else:
		return fibonacii(n-2)+fibonacii(n-1)
if len(sys.argv)>1:
	num = int(sys.argv[1])
	print(fibonacii(num))
else:
	print("Usage: \n\tfibonacii.py <number>")
	