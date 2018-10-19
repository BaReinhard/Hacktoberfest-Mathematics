#include<iostream>
#include<cmath>

using namespace std;

float areaFromSides(float a, float b, float c)
{
	float s = (a+b+c)/2;
	return sqrt(s*(s-a)*(s-b)*(s-c));
}


int main()
{
	float a, b, c;
	cout<<endl<<"Enter the three sides of the triangle :"<<endl;
	cin>>a>>b>>c;
	cout<<"The area of the triangle is "<< areaFromSides(a,b,c)<<" units"<<endl;
	return 0;
}
