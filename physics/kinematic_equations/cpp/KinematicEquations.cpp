/*
Author: xenocidewiki


It is assumed that acceleration (a) is constant.

v	=> velocity (ms^-1)
u	=> initial velocity (ms^-1)
a	=> acceleration (ms^-2)
d_x => delta x (change in position) (m)
t	=> time (s)

This is a simple application of the SUVAT equations.
*/

class KinematicEquations
{
public:

	//If d_x is unknown
	double velocity(double u, double a, double t) {
		return u + a * t;
	}

	//If v is unknown
	double distance_from_acceleration(double u, double a, double t) {
		return u * t + 0.5 * (a * t * t);
	}

	//If t is unknown
	double velocity_squared(double u, double a, double d_x) {
		return u*u + (2 * a * d_x);
	}

	//If a is unknown
	double distance_from_velocity(double u, double v, double t) {
		return ((v + u) / 2) * t;
	}
};
