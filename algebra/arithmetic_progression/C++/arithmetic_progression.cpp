#include <bits/stdc++.h> 
using namespace std; 

int Nth_of_AP(int a, int d, int N) 
{ 
	return (a + (N - 1) * d); 
	
} 
 
int main() 
{ 
 
	int a = 2; 

	int d = 1; 
	 
	int N = 5; 
	
	cout << "The "<< N 
		<<"th term of the series is : "
		<< Nth_of_AP(a,d,N); 

	return 0; 
} 
