# assuming that acceleration is constant

# v -> velocity (m/s)
# v_0 -> initial velocity (m/s)
# a -> acceleration (m/s/s)
# delta_x -> change in position (m)
# t -> time (s)

# if we don't know delta_x
def v(v_0, a, t):
    return v_0 + a * t

# if we don't know velocity
def delta_x(v_0, t, a):
    return v_0 * t + 0.5 * a * t * t

# if we don't know time
def v_squared(v_0, a, delta_x):
    return v_0 * v_0 + 2 * a * delta_x

# if we don't know acceleration
def delta_x(v, v_0, t):
    return 0.5 * t * (v + v_0)