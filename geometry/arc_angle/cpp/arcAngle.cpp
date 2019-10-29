#include <math.h>

float getArcAngle(float arcLenght, float radius) {
        return (360*arcLenght)/(M_PI*2*radius);
}