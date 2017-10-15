import sys

def vector_inner_product(u, v):
    inner_product = 0

    for i in range(len(v.entries)):
        inner_product += u.entries[i] * v.entries[i]

    return inner_product

def vector_projection(u, v):
    constant = vector_inner_product(u, v) / vector_inner_product(u, u)

    entries = []
    for entry in u.entries:
        entries.append(entry * constant)

    return Vector(entries)

def zero (v):
    for entry in v:
        if entry != 0:
            return False

    return True

def gram_schmidt_process(v):
    u = []

    for i, v_vector in enumerate(v):
        u_vector = v_vector

        try:
            for j in range(0, i):
                u_vector.subtract(vector_projection(u[j - 1], v_vector))
        except IndexError:
            sys.exit("All vectors should be the same size!")

        if not zero(u_vector.entries):
            u.append(u_vector)
    
    return u

class Vector:
    entries = []

    def __init__(self, entries):
        self.entries = entries

    def subtract(self, v):
        for i in range(len(v.entries)):
            self.entries[i] -= v.entries[i]
