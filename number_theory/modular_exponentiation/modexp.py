def power(x, y, mod) : 
	res = 1	 # Initialize result 

	# Update x if it is more Than or equal to mod 
	x = x % mod 
	while (y > 0) : 
		
		# If y is odd, multimodly x with result 
		if ((y & 1) == 1) : 
			res = (res * x) % mod 

		# y must be even now 
		y = y >> 1	 # y = y/2 
		x = (x * x) % mod 
		
	return res 
	

# Driver Code 
x,y,mod = map(int,input().split())
print("Result is ", power(x, y, mod)) 