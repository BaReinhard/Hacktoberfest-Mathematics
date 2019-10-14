#include<iostream>
#include<math.h>


using namespace std;

int main(){
	double G=6.67*pow(10,-11);
	double mass1, mass2, distance;
	cout<<"Enter mass of first object : ";
	cin>>mass1;
	cout<<"Enter mass of second object : ";
	cin>>mass2;
	cout<<"Enter Distance between them : ";
	cin>>distance;
	cout<<"Gravitational Force between them : "<<(G*(mass1  * mass2 ))/( pow(distance,2));
return 0;
}
