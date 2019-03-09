def relativisticMass(mass, velToLightSpeed):
        relMass = 0
        if velToLightSpeed < 1:
            relMass = mass / pow(1 - pow(velToLightSpeed, 2), 1/2)
        else:
            print("You cannot travel faster than light!")
        
        
        return relMass;
