from mass import Mass

def totally_inelastic_collision(A, B):
    V = (A.momentum() + B.momentum()) / (A.mass + B.mass)
    A.velocity = V
    B.velocity = V


# Adjust masses here!
A = Mass(1, 5)
B = Mass(10000, 0)
Pi = A.momentum() + B.momentum()
Ki = A.kinetic_energy() + B.kinetic_energy()

print "---[Before collision]---"
print "[Object A] %s" % A
print "[Object B] %s" % B
print "[Total] p=%f, K=%f" % (Pi, Ki)

totally_inelastic_collision(A, B)
Pf = A.momentum() + B.momentum()
Kf = A.kinetic_energy() + B.kinetic_energy()

print "---[After collision]---"
print "[Object A] %s" % A
print "[Object B] %s" % B
print "[Total] p=%f, K=%f" % (Pf, Kf)
