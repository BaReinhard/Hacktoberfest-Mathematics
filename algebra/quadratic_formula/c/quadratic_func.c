#include<stdio.h>
#include<math.h>
#include<stdlib.h>


void findRoots(int a, int b, int c)
{
    // If a is 0, then equation is not quadratic, but 
    // linear
    if (a == 0)
    {
        printf("Invalid");
        return;
    }

    int d = b*b - 4*a*c;
    double sqrt_val = sqrt(abs(d));

    if (d > 0)
    {
        printf("Roots are real and different \n");
        printf("%f\n%f",(double)(-b + sqrt_val)/(2*a)
            , (double)(-b - sqrt_val)/(2*a));
    }
    else if (d == 0)
    {
        printf("Roots are real and same \n");
        printf("%f",-(double)b / (2*a));
    }
    else // d < 0 
    {
        printf("Roots are complex \n");
        printf("%f + i%f\n%f - i%f", -(double)b / (2*a),sqrt_val
            ,-(double)b / (2*a), sqrt_val);
    }
}

int main()
{
    int a = 1, b = -7, c = 12;
    findRoots(a, b, c);
    return 0;
}
