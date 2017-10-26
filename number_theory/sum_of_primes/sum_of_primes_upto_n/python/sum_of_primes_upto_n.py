# Python program to find sum of primes
# in range from 1 to n.
 
# Returns sum of primes in range from
# 1 to n
 
def sumOfPrimes(n):
    # list to store prime numbers
    prime = [True] * (n + 1)
     
    # Create a boolean array "prime[0..n]"
    # and initialize all entries it as true.
    # A value in prime[i] will finally be
    # false if i is Not a prime, else true.
     
    p = 2
    while p * p <= n:
        # If prime[p] is not changed, then
        # it is a prime
        if prime[p] == True:
            # Update all multiples of p
            i = p * 2
            while i <= n:
                prime[i] = False
                i += p
        p += 1   
          
    # Return sum of primes generated through
    # Sieve.
    sum = 0
    for i in range (2, n + 1):
        if(prime[i]):
            sum += i
    return sum
 
# Driver code
var = raw_input("Enter n: ")
print sumOfPrimes(int(var))