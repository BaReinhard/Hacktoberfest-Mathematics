class Mass:
    # A class to represent mass involved in collision
    def __init__(self, mass, velocity):
        self.mass = float(mass)
        self.velocity = float(velocity)


    def momentum(self):
        return self.mass * self.velocity


    def kinetic_energy(self):
        return 0.5 * self.mass * self.velocity ** 2


    def __str__(self):
        return "v=%f, p=%f, K=%f" % (self.velocity, self.momentum(), self.kinetic_energy())
