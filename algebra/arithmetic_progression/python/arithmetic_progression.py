'''nth term of Arithmetic Progression is a + (n-1)*d
sum of arithmetic progression is (n*(2*a + (n-1)*d))/2
where n=number of terms
a = first term of an AP
d= common difference between 2 consecutive terms of an AP'''

class arithmetic_progression:
    '''It will have 2 functions to calculate nth term as well as sum of an arithmetic progression'''
    def __init__(self,a,d,n):
        self.a=a
        self.d=d
        self.n=n
        
    def nthterm(self):
        return self.a + (self.n-1)*self.d #To return nth term of AP
    
    def sum_ap(self):
            return self.n*(self.a*2 + (self.n-1)*self.d)/2

#demo        
ap=arithmetic_progression(2,2,5)
print (ap.nthterm())
print (ap.sum_ap())        
        
