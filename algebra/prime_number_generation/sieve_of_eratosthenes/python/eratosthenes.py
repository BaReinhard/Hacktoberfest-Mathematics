#simple implementation of Sieve of eratosthenes to efficiently calculate prime numbers

def prime_gen(upto):
    
    #2 is smallest prime number
    assert type(upto) is int and upto >= 2
    
    #create an list with all numbers marked as prime to begin with
    l = [True]*(upto+1)
    
    #seive of Eratosthenes 
    def sieve():
        for i in range(2,len(l)):
            for j in range(i*i, len(l), i):
                #mark number as composite
                l[j] = False
                   
        for prime_idx in range(2, len(l)):
            if l[prime_idx] == False:
                pass
            else:
                yield prime_idx

    return sieve()
