

def pressure(force, area):
    # could also be interpreted as [energy / volume].
    if area != 0:
        value = force / area
    else:
        value = float('Inf')
    return value


