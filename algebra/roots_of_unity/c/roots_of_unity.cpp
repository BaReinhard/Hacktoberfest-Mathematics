// A c++ program to print n'th roots of unity 
#include <bits/stdc++.h> 
using namespace std; 
  
// This function receives an integer n , and prints 
// all the nth roots of unity 
void printRoots(int n) 
{ 
    // theta = 2*pi/n 
    double theta = M_PI*2/n; 
  
    // print all nth roots with 6 significant digits 
    for(int k=0; k<n; k++) 
    { 
        // calculate the real and imaginary part of root 
        double real = cos(k*theta); 
        double img = sin(k*theta); 
  
        // Print real and imaginary parts 
        printf("%.6f", real); 
        img >= 0? printf(" + i "): printf(" - i "); 
        printf("%.6f\n", abs(img)); 
    } 
} 
  
// Driver function to check the program 
int main() 
{ 
    printRoots(1); 
    cout << endl; 
    printRoots(2); 
    cout << endl; 
    printRoots(3); 
    return 0; 
} 