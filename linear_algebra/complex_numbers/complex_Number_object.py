#Object for complex numbers - GGearing - 1 Oct 2019
from math import atan,pi ##Import mathematical functions and constants needed 

class ComplexNum(self):

  def __init__(self,Re,Im):   #Constructor
    self.Re=Re
    self.Im=Im
  
  def Show(self):
    print(str(self.Re)+" + i("+str(self.Im)+")")
  
  #Getters:
  def Re(self):
    return self.Re
  
  def Im(self):
    return self.Im
  #Setters:
  def setRe(self,newRe):
    self.Re=newRe
    
  def setIm(self,newIm):
    self.Im=newIm
  
  def GetConjugate(self):
    conjugate=ComplexNum(self.Re,-1*self.Im)
    return conjugate
    
  def Mod(self):
    return sqrt((self.Re)**2+(self.Im)**2)
  
  def Arg(self):
    tanResult=atan(self.Im/self.Re)
    if self.Re<0:
      return tanResult+pi
    else:
      return tanResult
      
      
