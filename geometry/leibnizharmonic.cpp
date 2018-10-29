
// CPP Program to print Leibniz Harmonic Triangle 
#include <bits/stdc++.h> 
using namespace std; 
  
// Print Leibniz Harmonic Triangle 
void LeibnizHarmonicTriangle(int n) 
{ 
    int C[n + 1][n + 1]; 
  
    // Calculate value of Binomial Coefficient in 
    // bottom up manner 
    for (int i = 0; i <= n; i++) { 
        for (int j = 0; j <= min(i, n); j++) { 
  
            // Base Cases 
            if (j == 0 || j == i) 
                C[i][j] = 1; 
  
            // Calculate value using previously  
            // stored values 
            else
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
        } 
    } 
  
    // printing Leibniz Harmonic Triangle 
    for (int i = 1; i <= n; i++) { 
        for (int j = 1; j <= i; j++) 
            cout << "1/" << i * C[i - 1][j - 1] << " "; 
  
        cout << endl; 
    } 
} 
