// just include this file and call functions
#include <cmath>

float circle(float radius)
{
  return M_PI * pow(radius, 2);
}

float triangle(float base, float height)
{
  return (base * height)/2;
}

float square(float side)
{
  return pow(side, 2);
}

float triangle_herons(float side_1, float side_2, float site_3)
{
  float s = (side_1 + side_2 + side_3) / 3;
  return sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
}

float rectangle(float length, float breadth)
{
  return length * breadth;
}

float ellipse(float a, float b)
{
  return M_PI * a * b;
}

float sphere(float radius)
{
  return 4 * M_PI * pow(radius, 2);
}

float hemisphere_total(float radius)
{
  return (sphere(radius) / 2) + (M_PI * pow(radius, 2));
}

float hemisphere_curved(float radius)
{
  return (sphere(radius) / 2);
}

float sector(float radius,float angle):
{
  return (pow(radius, 2) * angle) / 2;
}

float cylinder_curved(float radius,float height):
{
  return 2 * M_PI * radius * height;
}

float cylinder_total(float radius,float height):
{
  return 2 * M_PI * radius *  (height + radius);
}
float trapezoid(float base_one,float base_two,float height):
{
  return ((base_one + base_two) * height) / 2;
}
