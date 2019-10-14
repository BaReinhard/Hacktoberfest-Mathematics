#include<iostream>
#include<math.h>

using namespace std;

int main(){
	double mass, acceleration;
	cout<<"Enter Mass : ";
	cin>>mass;
	cout<<endl<<"Enter Acceleration : ";
	cin>>acceleration;
	cout<<"Force applied is  :"<<mass*acceleration<<"N";
	return 0;
}
