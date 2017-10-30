#Here, a is the first term, r being the common ratio and n is the number of terms
class geometric_progression:
    '''It will have 2 functions to calculate nth term as well as sum of a geometric progression'''
    def __init__(self,a,r,n):
        self.a=a
        self.r=r
        self.n=n
        
    def nthterm(self):
        return self.a*(self.r**(self.n-1)) #To return nth term of GP
    
    def sum_gp(self):
        if self.r==1: #if r=1, sum of a GP will be (number of terms * first term)
            return self.n*self.a
        else:
            return self.a*((1-self.r**self.n)/(1-self.r))
        
