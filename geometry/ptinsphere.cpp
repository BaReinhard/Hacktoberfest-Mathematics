#include <bits/stdc++.h> 
using namespace std; 
// function to calculate the distance between centre and the point 
int check(int cx, int cy, int cz, int x, int y, int z) 
{ 
    int x1 = pow((x - cx), 2); 
    int y1 = pow((y - cy), 2); 
    int z1 = pow((z - cz), 2); 
  
    // distance between the centre  
    // and given point 
    return (x1 + y1 + z1);  
} 
  
// Driver program to test above function 
int main() 
{ 
    // coordinates of centre 
    int cx = 1, cy = 2, cz = 3;  
  
    int r = 5; // radius of the sphere 
    int x = 4, y = 5, z = 2; // coordinates of point 
  
    int ans = check(cx, cy, cz, x, y, z); 
  
    // distance btw centre and point is less  
    // than radius 
    if (ans < (r * r)) 
        cout << "Point is inside the sphere";  
  
    // distance btw centre and point is  
    // equal to radius 
    else if (ans == (r * r)) 
        cout << "Point lies on the sphere";  
  
    // distance btw center and point is 
    // greater than radius 
    else
        cout << "Point is outside the sphere"; 
    return 0; 
}
