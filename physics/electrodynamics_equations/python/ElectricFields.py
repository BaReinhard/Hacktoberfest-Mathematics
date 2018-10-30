import math
class ElectricFields(object):
    E_FIELD_CONST = 8.854e-12
    k=9*pow(10,9)
    
    def force(q1,q2,r):
        if(radius <= 0 ):
            raise ValueError("Never seen negative radius.")
         return (k*q1*q2)/(r*r)
    
    def E_field(Q):
        return force(Q,1,1)/Q
    
    def field_of_homogeneous_spehere_at(self, electricCharge, radius):
        if(radius <= 0 ):
            raise ValueError("Never seen negative radius.")
        return (electricCharge)/(4*math.pi*self.E_FIELD_CONST*(radius*radius))

    def field_of_ladder_at(self, line_charge_density, distance):
        if (distance <= 0):
            raise ValueError("Never seen negative radius.")
        return (line_charge_density)*(1/(2*math.pi*self.E_FIELD_CONST*distance))

    def field_of_plane(self,plane_charge_density):
        return 0.5*(plane_charge_density/self.E_FIELD_CONST)

    def field_of_plate_capacitor(self,voltage, distance):
        if distance <= 0:
            raise ValueError("Never seen negative radius.")
        return voltage/distance
