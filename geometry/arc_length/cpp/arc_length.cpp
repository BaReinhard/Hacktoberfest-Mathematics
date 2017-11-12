#include <iostream>
using namespace std;

// angle must be in radians
float arc_len(float radius, float angle)
{
  return radius * angle;
}

int main()
{
  cout<<arc_len(10.25, 49.7);
  return 0;
}
