import math    
x=float(( input ('x ? ' )))  
n  = 1000   #a big number 
b=0      
for i in range (n):    
   a=(((((-1)**i))*(x**((2*i)+1)))/(math.factorial((2*i)+1)))   
   b+=a     
print (b)
