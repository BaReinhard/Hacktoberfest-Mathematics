#include<iostream>
#include<cmath>

/*
v stands for velocity in m/s
u stands for initial velocity m/s
a stands for acceleration in m/s/s
s stands for change in position in m
t stands for time in s
*/

//First equation of motion

	//To calculate v from first equation of motion
	float vFirst(float u, float a, float t)
	{
		return u + a*t;
	}
	
	//To calculate u from first equation of motion
	float uFirst(float v, float a, float t)
	{
		return v - a*t;
	}

	//To calculate a from first equation of motion
	float aFirst(float v, float u, float t)
	{
		return (v-u)/t;
	}

	//To calculate t from first eqation of motion
	float tFirst(float v, float u, float a)
	{
		return (v-u)/a;
	}


//Second equation of motion

	//To calculate s from second equation of motion
	float sSecond(float u, float t, float a)
	{
		return u*t + 0.5*a*t*t;
	}

	//To calculate u from second equation of motion
	float uSecond(float s, float t, float a)
	{
		return s/t- 0.5*a*t;
	}

	//To calculate a from second equation of motion
	float aSecond(float u, float s, float t)
	{
		return 2*(s/(t*t)-u/t);
	}


//Third equation of motion

	//To calculate v from Third equation of motion
	float vThird(float u, float s, float a)
	{
		return sqrt(u*u + 2*a*s);
	}

	//To calculate u from Third equation of motion
	float uThird(float v, float s, float a)
	{
		return sqrt(v*v - 2*a*s);
	}

	//To calculate a from Third equation of motion
	float aThird(float v, float u, float s)
	{
		return (v*v - u*u)/(2*s);
	}

	//To calculate s from Third equation of motion
	float sThird(float v, float u, float a)
	{
		return (v*v - u*u)/(2*a);
	}

