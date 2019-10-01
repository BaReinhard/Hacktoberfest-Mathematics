
#include <iostream> 
#include <complex> 
  
using namespace std; 
  
typedef complex<double> point; 
#define x real() 
#define y imag() 

#define PI 3.1415926535897932384626 

void displayPoint(point P) 
{ 
    cout << "(" << P.x << ", " << P.y << ")" << endl; 
} 

point reflect(point P, point A, point B) 
{ 

    point Pt = P-A; 
    point Bt = B-A; 

    point Pr = Pt/Bt; 

  
    return conj(Pr)*Bt + A; 
} 
  
int main() 
{ 

    point P(4.0, 7.0); 
    point A(1.0, 1.0); 
    point B(3.0, 3.0); 
  
      
    point P_reflected = reflect(P, A, B); 
    cout << "The point P on reflecting about AB becomes:"; 
    cout << "P_reflected"; displayPoint(P_reflected); 
  
    return 0; 
} 