#include<iostream>
using namespace std;

int main(void)
{
  double arc_length,angle,radius;
  cout<<"Please enter Radius"<<endl;
  cin>>radius;
  cout<<"Please enter angle"<<endl;
  cin>>angle;
  arc_length=radius*angle; // Angle should be given in radians only
  cout<<"Arc length is "<<arc_length;
}
