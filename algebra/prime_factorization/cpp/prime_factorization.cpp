/* This program find four things.
   1.  number of prime factors of a number
   2.  if the number is primeFactors
   3.  largest Prime Factor of a number
   4.  print all prime factors of a number
   
   Note:- 1 has no prime factors
 */
// CPP-14
 
#include <bits/stdc++.h>

using namespace std;
const int siz = 1e7;        // siz limit, due to memory limit it will work upto 1e7    
vector<int> primeFactors(siz,1);
vector<int> largestPrimeFactor(siz,1);

// this method perform first three tasks of this program
int find_PrimeFactors(){        

    for(int i = 2; i <= (int)sqrt(siz); i++){
        if(primeFactors[i] == 1){
            largestPrimeFactor[i] = i;
            for(int j = 2*i; j <= siz; j += i){
                primeFactors[j] = primeFactors[j/i] + 1;
                largestPrimeFactor[j] = i;
            }
        }
    }
    
    return 0;
}

// this method print all prime factors of a number
void printAllPrimeFactors(int x){
    
    int j = largestPrimeFactor[x];
    while(j != 1){
        cout << j << " ";
        x = x / j;
        j = largestPrimeFactor[x];
    }

}

int main()
{
    find_PrimeFactors();
    int j = 48650;      // example
    cout << primeFactors[j] << endl;
    cout << largestPrimeFactor[j] << endl;
    printAllPrimeFactors(j);
    return 0;
}
