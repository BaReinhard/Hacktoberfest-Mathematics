
// CPP Program to calculate  
// volume of Octahedron 
#include <bits/stdc++.h> 
using namespace std; 
  
// utility Function 
double vol_of_octahedron(double side) 
{ 
    return ((side*side*side)*(sqrt(2)/3)); 
} 
  
// Driver Function 
int main() 
{ 
    double side = 3; 
    cout << "Volume of octahedron ="
         << vol_of_octahedron(side) 
         << endl; 
} 
