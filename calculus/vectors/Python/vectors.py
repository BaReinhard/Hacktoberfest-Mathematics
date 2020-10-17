from math import sqrt

def magnitude(v):
  result=0
  for i in range(len(v)):
    result+=v[i]**2
  return sqrt(result)
  
def difference(v1,v2):
  for i in range(len(v1)):
    v1[i]=v1[i]-v2[i]
   return v1
   
def addition(v1,v2):
  for i in range(len(v1)):
    v1[i]=v1[i]+v2[i]
   return v1
   
def dotProduct(v1,v2):
  dotProd=0
  for i in range(len(v1)):
    dotProd+=v1[i]*v2[i]
   return dotProd
   
