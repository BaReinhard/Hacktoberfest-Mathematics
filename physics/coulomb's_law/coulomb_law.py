import numpy as np
import matplotlib.pyplot as plt
from scipy.constants import e, epsilon_0

def coulomb_energy(qi, qj, r):
    """
    Calculation of Coulomb's law.
    
    Parameters
    ----------
    qi: float
        Electronic charge on particle i
    qj: float
        Electronic charge on particle j
    r: float 
        Distance between particles i and j (Å)
        
    Returns
    -------
    float
        Energy of the Coulombic interaction (eV)
    """
    energy_joules = (qi * qj * e ** 2) / (
        4 * np.pi * epsilon_0 * r * 1e-10)
    return energy_joules / 1.602e-19

r = np.linspace(3, 5, 100)
plt.plot(r, coulomb_energy(1, -1, r))
plt.xlabel(r'$r$/Å')
plt.ylabel(r'$E$/eV')
plt.show()
