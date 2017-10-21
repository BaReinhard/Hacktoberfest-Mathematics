#include <iostream>
#include <math.h>
#include <ctype.h>
#define PI 3.14159265
using namespace std;

int main(){
	double radius;
	double area;
	char d;
	bool end = false;
	while(!end){ 
		cout << "Would you like to know the area(a), circumference(c), radius(r) or quit(q)?" << endl;
		cin >> d;
		switch(tolower(d)){
			case 'a':
				cout << "What is the radius of your circle? " << endl;
				cin >> radius;
				cout << "The area of your circle is: " << PI * radius * radius << endl;
				break;
			case 'c':
				cout << "What is the radius of your circle? " << endl;
				cin >> radius;
				cout << "The circumference of your circle is: " << 2 * PI * radius << endl;
				break;
			case 'r':
				cout << "What is the area of your circle? " << endl;
				cin >> area;
				cout << "The radius of your circle is: " << sqrt(area / PI) << endl;
				break;
			default:
				end = true;
				break;
		}
	}
	return 0;
}
