// just include this file and call the functions
#include <cmarth>
#include <iostream>
using namespace std;

string determinePointLocation(float center_x,float center_y,float radius,float point_x,float point_y)
{
  string result[] = {"on the circle", "in the circle", "outside the circle"};
  float chk = pow((point_x-center_x), 2) + pow((point_y-center_y), 2) - pow(radius, 2);

  if(chk == 0)
    return result[0];
  else if(chk > 0)
    return result[2];
  else
  return result[1];
}

float getRadius(float center_x, float center_y, float point_x, float point_y):
{
  return sqrt( pow( ( point_x - center_x), 2) + pow( ( point_y - center_y ), 2) );
}

float arc_length(float radius,float angle):
{
  return (angle *radius * M_PI * (1/180));
}
