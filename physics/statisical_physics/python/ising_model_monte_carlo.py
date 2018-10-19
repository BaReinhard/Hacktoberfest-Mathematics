import numpy as np
import matplotlib as ml
import matplotlib.pyplot as plt

SIZE = 20 # e.g. 20 for a 20 by 20 lattice
STEPS = 150000
TEMPERATURE = 10 # the temperature for your run (0.1-100)

def bc(i): # Check periodic boundary conditions 
    if i+1 > SIZE-1:
        return 0
    if i-1 < 0:
        return SIZE-1
    else:
        return i

def energy(system, N, M): # Calculate internal energy
    return -1 * system[N,M] * (system[bc(N-1), M] + system[bc(N+1), M] + system[N, 
bc(M-1)] + system[N, bc(M+1)])

def build_system(): # Build the system 
    system = np.random.randint(0,1,(SIZE,SIZE))
    system[system==0] =-1  
    return system

def plot(H):
    fig = plt.figure(figsize=(6, 3.2))

    ax = fig.add_subplot(111)
    ax.set_title('Ising Model')
    plt.imshow(H)
    ax.set_aspect('equal')

    cax = fig.add_axes([0.12, 0.1, 0.78, 0.8])
    cax.get_xaxis().set_visible(False)
    cax.get_yaxis().set_visible(False)
    cax.patch.set_alpha(0)
    cax.set_frame_on(False)
    cbar = plt.colorbar(ticks=[-1, 1])
    cbar.ax.set_yticklabels(['-1', '1'])# vertically oriented colorbar
    plt.show()

def main(T): # The Main monte carlo loop
    system = build_system()

    for step, x in enumerate(range(STEPS)):
        M = np.random.randint(0,SIZE)
        N = np.random.randint(0,SIZE)

        E = -2. * energy(system, N, M)

        if E <= 0.:
            system[N,M] *= -1
        elif np.exp(-1./T*E) > np.random.rand():
            system[N,M] *= -1
    return system
    
def run(): # Run the menu for the monte carlo simulation and Plot result
    print('='*70)
    print('\tMonte Carlo Statistics for an ising model with')
    print('\t\tperiodic boundary conditions')
    print('='*70)
    
    T = TEMPERATURE
    H = main(T)
    plot(H)

run()
