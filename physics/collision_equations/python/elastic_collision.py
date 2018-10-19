from mass import Mass

def elastic_collision(A, B):
    Vaf = A.velocity - 2 * B.mass / (A.mass + B.mass) * (A.velocity - B.velocity)
    Vbf = B.velocity - 2 * A.mass / (A.mass + B.mass) * (B.velocity - A.velocity)
    A.velocity = Vaf
    B.velocity = Vbf


# Adjust masses here!
A = Mass(1, 5)
B = Mass(2, -3)
Pi = A.momentum() + B.momentum()
Ki = A.kinetic_energy() + B.kinetic_energy()

print "---[Before collision]---"
print "[Object A] %s" % A
print "[Object B] %s" % B
print "[Total] p=%f, K=%f" % (Pi, Ki)

elastic_collision(A, B)
Pf = A.momentum() + B.momentum()
Kf = A.kinetic_energy() + B.kinetic_energy()

print "---[After collision]---"
print "[Object A] %s" % A
print "[Object B] %s" % B
print "[Total] p=%f, K=%f" % (Pf, Kf)
