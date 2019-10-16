/*
    Author : Ayran Olckers
    Date : 16/10/2019
    Description : The following code calls the last number in the  Fibonacci sequence.
*/

#include <iostream>

// Well there’s not much to say, as it is not a very tricky problem. I just
// implemented the algorithm. Instead of storing the whole Fibonacci number,
//  just store their modulus and calculate the next one using that.
// 

int get_fibonacci_last_digit(long long n) 
{
    int first = 0;
    int second = 1;

    int res;

    for (int i = 2; i <= n; i++) {
        res = (first + second) % 10;
        first = second;
        second = res;
    }

    return res;
}

int main() 
{
    int n;
    std::cin >> n;
    int c = get_fibonacci_last_digit(n);
    std::cout << c << '\n';

    return 0;
}