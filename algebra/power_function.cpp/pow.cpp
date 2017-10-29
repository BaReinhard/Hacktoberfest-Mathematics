#include <bits/stdc++.h>
using namespace std;

int main(){
	int a, b, temp=1;
	cout << "Enter the number a and b to calculate a^b:\n";
	cin >> a >> b;
	for (int i = 1; i <= b; i++)
	{
		temp *= a;
	}
	cout << temp << endl;
	return 0;
}