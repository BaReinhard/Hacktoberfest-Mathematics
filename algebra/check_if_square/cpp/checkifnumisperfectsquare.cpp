#include <bits/stdc++.h>

#define endl << "\n"
#define sp << " " <<
#define inf 2000000000
using namespace std;

int main()                    
{
    int n;
    cin >> n;
    if(round(sqrt(n)) * round(sqrt(n)) == n)
        cout << "Pefect square!\n";
        // for(int i = -9; i <= 9; ++i){
    //     for(int j = -9; j <= 9; ++j){
    //         if(i==0 || j==0)continue;
    //         int e = pow(i, 2) * pow(j, 2) - 4 * pow(i, 3) + 4 * (pow(j, 3)) - 6 * i *  j + 5;
    //         if(e< 0)continue;

    //         int s = sqrt(e);
    //         if(pow(s, 2) == e){
    //             cout << "x^3 + " << i << "x^2 + " << j << "x + 1  gives final values of " << (i * j - 3 + s)/2  << " and " << (i * j - 3 - s)/2 << " \n";
    //         }
    //     }
    // }

}

