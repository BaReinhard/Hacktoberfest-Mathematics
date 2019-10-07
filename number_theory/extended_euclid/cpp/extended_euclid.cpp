#include <bits/stdc++.h>
using namespace std;

class Triplet{
public:
    int gcd;
    int x;
    int y;
};

Triplet gcdExtendedEuclid(int a,int b){
    if(b==0){
        Triplet myAns;
        myAns.gcd = a;
        myAns.x = 1;
        myAns.y = 0;
        return myAns;
    }
    Triplet smallAns = gcdExtendedEuclid(b,a%b);
    Triplet myAns;
    myAns.gcd = smallAns.gcd;
    myAns.x = smallAns.y;
    myAns.y = smallAns.x-((a/b)*smallAns.y);
    return myAns;
}
int main(){
    int a,b;
    cin >> a >> b;
    Triplet ans = gcdExtendedEuclid(a,b);
    cout << ans.gcd << endl << ans.x << endl << ans.y << endl;
}
