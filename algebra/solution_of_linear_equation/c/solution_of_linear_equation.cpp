/*
  CPP program to find x and y satisfying ax + by = n
  Examples:
    Input : n = 7, a = 2, b = 3
    Output: x = 2, y = 1
    Explanation: Here x and y satisfies the equation
*/

#include <bits/stdc++.h> 
using namespace std; 
  
// function to find the solution 
void solution(int a, int b, int n) 
{ 
    // traverse for all possible values 
    for (int i = 0; i * a <= n; i++) { 
  
        // check if it is satisfying the equation 
        if ((n - (i * a)) % b == 0) { 
            cout << "x = " << i << ", y = " 
                 << (n - (i * a)) / b; 
            return; 
        } 
    } 
  
    cout << "No solution"; 
} 
  
// driver program to test the above function 
int main() 
{ 
    int a = 2, b = 3, n = 7; 
    solution(a, b, n); 
    return 0; 
} 