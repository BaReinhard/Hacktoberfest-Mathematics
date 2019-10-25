import math    
x = float( input('x ? ' ) )  
n = 50 	# a big number (reduce if there's an overflow in the factorial)
final = 0      
for i in xrange(n):    
   term = ( ((-1)**i) * (x**(2*i)) ) / math.factorial(2*i)
   final += term     
print(final)