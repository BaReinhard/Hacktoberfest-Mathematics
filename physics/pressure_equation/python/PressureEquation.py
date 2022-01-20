def calculatePressure(force, area):
    if area == 0:
        return "Area cannot be zero."
    else:
        pressure = force / area
        return pressure
