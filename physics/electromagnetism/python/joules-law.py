# Joule's law: P = IV

# P = IV
def get_power(current, voltage):
  return current * voltage

# I = P/V
def get_current(power, voltage):
  return power / voltage

# V = P/I
def get_voltage(power, current):
  return power / current
