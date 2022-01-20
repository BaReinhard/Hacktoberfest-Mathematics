// C++ program to check if octal 
// representation of a number is prime 
#include <iostream> 
using namespace std; 
  
const int MAX_DIGITS = 20; 
  
/* Function to Check no is in octal 
or not */
bool isOctal(long n) 
{ 
    while (n) 
    { 
        if ((n % 10) >= 8) 
            return false; 
        else
            n = n / 10; 
    } 
    return true; 
} 
  
/* Function To check no is palindrome 
or not*/
int isPalindrome(long n) 
{ 
    // If number is already in octal, we traverse 
    // digits using repeated division with 10. Else 
    // we traverse digits using repeated division  
    // with 8 
    int divide = (isOctal(n) == false)? 8 : 10; 
  
    // To store individual digits  
    int octal[MAX_DIGITS]; 
  
    // Traversing all digits 
    int i = 0; 
    while (n != 0) 
    { 
        octal[i++] = n % divide; 
        n = n / divide; 
    } 
  
    // checking if octal no is palindrome 
    for (int j = i - 1, k = 0; k <= j; j--, k++) 
        if (octal[j] != octal[k]) 
            return false; 
  
    return true; 
} 
  
// Driver code 
int main() 
{ 
    long n = 97; 
    if (isPalindrome(n)) 
    cout << "Yes"; 
    else
    cout << "No"; 
    return 0; 
} 