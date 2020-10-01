#include <bits/stdc++.h>
int main()
{
     int a, d, n, tn;
     int sum = 0;
 
     printf("Enter the first term value of the A.P. series: ");
     scanf("%d", &a);
     printf("Enter the total numbers of terms in the A.P. series: ");
     scanf("%d", &n);
     printf("Enter the common difference of A.P. series: ");
     scanf("%d", &d);
     // nth term
     tn = a + (n - 1) * d;
     //sum of first n terms using formula
     sum = (n * (a + tn))/ 2;
     // sum of first n term by add term by term
     printf("Sum of the A.P series is: ");
     while(a <= tn)
     {
       a=a+d;
     }
      printf("%d", a)
     return 0;
}
