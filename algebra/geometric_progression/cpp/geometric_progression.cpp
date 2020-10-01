/*
 * C++ Program to Calculate Sum of Geometric Progression
 */
#include <iostream>
 
void calSumGP(float a, float r, int n)
{
    float sum = 0, temp = a;
 
    for (int i = 1; i < n; i++)
    {
        sum = sum + temp;
        temp = temp * r;
    }
    std::cout << "Sum of geometric progression : "
              << sum << std::endl;
}
 
int main()
{
    int n;
    float a, r;
 
    std::cout << "Enter the value of a = ";
    std::cin  >> a;
    std::cout << "Enter the value of r = ";
    std::cin  >> r;
    std::cout << "Enter the value of n = ";
    std::cin  >> n;
    calSumGP(a, r, n);
}
