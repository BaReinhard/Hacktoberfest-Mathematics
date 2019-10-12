#include <bits/stdc++.h>
#include <math.h>

#define endl << "\n"
#define sp << " " <<
#define inf 2000000000
using namespace std;

int main()                    
{
    int n;
    cin >> n;
    if(round(pow(n,1/3)) * round(pow(n,1/3)) * round(pow(n,1/3)) == n)
        cout << "Pefect Cube!\n";
}
