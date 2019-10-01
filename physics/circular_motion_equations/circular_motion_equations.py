from math import pi

def angularVelocity(timePeriod):
  return (2*pi)/timePeriod

def angularAcceleration(timePeriod,radius):
  return ((angularVelocity(timePeriod))**2)*radius

def centripetalForce(timePeriod,radius,mass):
  return mass*(angularAcceleration(timePeriod,radius))
  
