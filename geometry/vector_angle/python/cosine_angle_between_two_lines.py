# LANGUAGE: Pyton
# AUTHOR: Arsalan Azmi
# PURPOSE: Calculate the angle between two vectors

import math
from math import *

uii = input('X component of the first vector :')
uji = input('Y component of the first vector :')
uzi = input('Z component of the first vector :')

vii = input('X component of the second vector :')
vji = input('Y component of the second vector :')
vzi = input('Z component of the second vector :')

ui = int(uii)
uj = int(uji)
uz = int(uzi)

vi = int(vii)
vj = int(vji)
vz = int(vzi)

dot_product = ui*vi + uj*vj + uz*vz
length_of_u = sqrt((ui*ui)+(uj*uj)+(uz*uz))
length_of_v = sqrt((vi*vi)+(vj*vj)+(vz*vz))
denominator = length_of_u*length_of_v
 
print("The angle is: cosθ = "+str(dot_product)+"/"+str(denominator))
print("Hence, θ = cos^-1("+str(dot_product)+"/"+str(denominator)+")")
cos = dot_product/denominator # Cos of the given vectors
acosi = math.acos(cos) #Inverse of cos to find the angle in rads
acos = str(math.acos(cos))
print("Therefore, θ = "+acos)