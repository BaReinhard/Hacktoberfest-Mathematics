#include <iostream>
using namespace std;

//static int fibs[1000007]={0,1,1};
int fib(int n){
    if(n==0) return 0;
    else if(n==1) return 1;
    else{
        return fib(n-1) + fib(n-2);
    }
    
}

int main()
{
    int n;

    cout << "Enter a number to calculate the fibonacci: ";
    cin >> n;
    
    cout << fib(n);
    return 0;
}
