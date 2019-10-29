#include<bits/stdc++.h>
using namespace std;


double calculate_distance(pair<double,double> u,pair<double,double> v){
    return sqrt( pow(u.first - v.first,2) + pow(u.second - v.second,2) );
}

int main() {
    double a1,b1,a2,b2;
    cin>>a1>>b1>>a2>>b2;
    cout<<calculate_distance({a1,b1},{a2,b2});
}