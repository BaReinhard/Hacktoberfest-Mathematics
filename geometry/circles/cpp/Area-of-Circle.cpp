/*
    Author : Ayran Olckers
    Date : 16/10/2019
    Description : The following code calculates area of a circle in units based on the radius with Pi
    
    site: https://ayran.dev
*/

#include <iostream>
#include <cmath>

using namespace std;

float area(int radius) 
{
   return M_PI * (radius * radius);
}

int main () {
   //change area(n) to the radius you want
   cout << "Area of a circle with radius n unit is: " << area(1.2);
}