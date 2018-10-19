def Ackermann(m, n):
  if(m==0):
    return(n+1)
  elif (m>0 and n==0):
    return(Ackermann(m-1,1))
  else:
    return(Ackermann(m-1, Ackermann(m, n-1)))
