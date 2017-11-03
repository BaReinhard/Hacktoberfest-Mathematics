# 2-dimensional waves in space defined by Amplitude, angular velocity, wavenumber and phase to a certain distance of origin at a certain time
# all units SI/IS (m, rad, s...)

# author: Marcos Gómez (margobra8)
# github.com/margobra8

import math


class Wave(object):
    def __init__(self, amplitude=0, ang_vel=0, wavenumber=0, phase=0, period=0, wavelength=0, freq=0):
        if ang_vel == 0:
            ang_vel = (2 * math.pi * freq)
        if wavenumber == 0:
            wavenumber = (2 * math.pi) / wavelength
        if wavelength == 0:
            wavelength = (2 * math.pi) / wavenumber

        if (period == 0) and (freq == 0):
            freq = ang_vel / (2 * math.pi)
            period = 1 / freq
        elif (period == 0) and (freq != 0):
            period = 1 / freq
        elif (period != 0) and (freq == 0):
            freq = 1 / period

        self.amplitude = amplitude
        self.ang_vel = ang_vel
        self.wavenumber = wavenumber
        self.phase = phase
        self.period = period
        self.wavelength = wavelength
        self.freq = freq
        self.velocity_factor = wavelength / period
        self.max_osc_velocity = amplitude * ang_vel
        self.max_osc_acceleration = amplitude * ang_vel**2

    def vertical_position(self, x_from_origin, time):
        return self.amplitude * math.sin(self.ang_vel * time - self.wavenumber * x_from_origin + self.phase)

    def osc_velocity(self, x_from_origin, time):
        return self.amplitude * self.ang_vel * math.cos(self.ang_vel * time - self.wavenumber * x_from_origin + self.phase)

    def osc_acceleration(self, x_from_origin, time):
        return -self.amplitude * self.ang_vel**2 * math.sin(self.ang_vel * time - self.wavenumber * x_from_origin + self.phase)
