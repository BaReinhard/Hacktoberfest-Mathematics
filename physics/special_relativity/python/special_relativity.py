import math

# Function to calculate relativistic mass
# params : mass and velocity_rel_to_light(velocity in terms of speed of light ie. 0.1c or 0.2c ...)
# returns : relativistic mass or -1 if error is there
def massToRelativisticMass(mass, velocity_rel_to_light):
    rel_Mass = 0.0
    if(velocity_rel_to_light > 1):
        print("Particle cannot travel greater than the speed of light!!")
        return -1
    else:
        rel_Mass = (mass/math.sqrt(1-math.pow(velocity_rel_to_light,2)))
        return rel_Mass

# Function to calculate Length contraction
# params : length (rest length) and velocity_rel_to_light(velocity in terms of speed of light ie. 0.1c or 0.2c ...)
# returns : contracted length or -1 if error is there
def contractedLength(length, velocity_rel_to_light):
    cont_length = 0.0
    if(velocity_rel_to_light > 1):
        print("Particle cannot travel greater than the speed of light!!")
        return -1
    else:
        cont_length = (length*math.sqrt(1-math.pow(velocity_rel_to_light,2)))
        return cont_length

# Function to calculate time dilation
# params : time (from rest frame) and velocity_rel_to_light(velocity in terms of speed of light ie. 0.1c or 0.2c ...)
# returns : dilated time or -1 if error is there
def dilatedTime(time, velocity_rel_to_light):
    dil_time = 0.0
    if(velocity_rel_to_light > 1):
        print("Particle cannot travel greater than the speed of light!!")
        return -1
    else:
        dil_time = (time/math.sqrt(1-math.pow(velocity_rel_to_light,2)))
        return dil_time