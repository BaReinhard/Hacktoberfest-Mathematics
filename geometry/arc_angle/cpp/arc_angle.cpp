#include <iostream>
#include <cmath>
using namespace std;

float arc_angle(float radius, float arc_length)
{
  return (360 * arc_length) / ( M_PI * 2 * radius);
}
int main()
{
  cout<<arc_angle(10.9, 20.5);
  return 0;
}
