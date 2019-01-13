'''
For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
with 'a' being the initial term and 'd' being the common difference
'''


#This function calculates the sum of the first n terms
def ap(a,n,d):
    Sum = (n * (2 * a + (n - 1)* d ))/ 2
    print("Sum of the AP series is: ",Sum)

# This function calculates the nth term
def term(a,n,d):
    tn = (a + (n - 1)* d)
    print("Nth term of the AP series is: ",tn)    
  

if __name__ == "__main__":    
    a=int(input("Enter the first term value of the A.P. series: "))
    n=int(input("Enter the total numbers in the A.P. series: "))
    d=int(input("Enter the common difference of A.P. series: "))
    term(a,n,d)
    ap(a,n,d)
    
