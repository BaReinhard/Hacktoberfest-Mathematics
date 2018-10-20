// CPP program to calculate Discriminant 

#include <bits/stdc++.h> 
  
using namespace std; 
  
void discriminant(int a, int b, int c){ 
  
    int discriminant = (b*b) - (4*a*c); 
    if(discriminant > 0){ 
        cout<<"Discriminant is "<<discriminant 
            <<" which is Positive"<<endl; 
              
        cout<<"Hence Two Solutions"; 
    } 
    else if(discriminant == 0){ 
        cout<<"Discriminant is "<<discriminant 
            <<" which is Zero"<<endl; 
              
        cout<<"Hence One Solution"; 
    } 
    else if(discriminant < 0){ 
        cout<<"Discriminant is "<<discriminant 
            <<" which is Negative"<<endl; 
              
        cout<<"Hence No Real Solutions"; 
    } 
} 
  
// Driver Code 
int main(){ 
    int a = 20, b = 30, c = 10; 
  
    // function call to print discriminant 
    discriminant(a, b, c); 
    return 0; 
}