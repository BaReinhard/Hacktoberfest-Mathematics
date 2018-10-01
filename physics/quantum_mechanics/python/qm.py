def energy_of_photon(freq):
    h=(6.63)*(10**(-34))
    return h * freq
    
def momentum_of_photon(freq):
    h=(6.63)*(10**(-34))
    c=3*(10**(8))
    return (h * freq)/c

def maximum_kinetic_energy_photoelectron(freq,work_func):
    h=(6.63)*(10**(-34))
    return (h*freq)-work_func
