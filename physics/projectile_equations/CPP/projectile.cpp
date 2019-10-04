/*
Author: Sunny


It is assumed that acceleration due to gravity g is constant.

u = initial velocity
theta = angle of projection in degree
*/
#include <bits/stdc++.h>
#define g 9.8
#define PI 3.14
using namespace std;

double time_period(double u, double theta){
    /*
    T = (2usin(theta))/g
    */
    return (2*u*sin(theta*180/PI))/g;
}

double range(double u, double theta){
    /*
    R = (u^2sin(2*theta))/g
    */
    return (u*u*sin(2*theta*180/PI))/g;
}

double maximum_height(double u, double theta){
    /*
    Hmax = (u*sin(theta))^2/g
    */
    return pow(u*sin(theta*180/PI), 2)/g;
}


