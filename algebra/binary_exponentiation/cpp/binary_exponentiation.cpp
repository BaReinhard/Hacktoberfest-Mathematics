// Binary exponentiation a^n mod m.
#include <iostream>
using namespace std;

long BinaryExponentiation(long a, long n, long m) {
    long result = 1;
    for (; n; n >>= 1) {
        if (n & 1) 
        	result = (result * a) % m;
        a = (a * a) % m;
    }
    return result;
}

int main(){
	long a, n, m;
	cin >> a >> n >> m;
	cout << BinaryExponentiation(a, n, m);
	return 0;
}
