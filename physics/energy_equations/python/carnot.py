#T1 is temp at supply and T2 is temperature of the sink
def carnot(T1, T2):
  return (T1-T2)/T1*100
  
print carnot(1000,200)


