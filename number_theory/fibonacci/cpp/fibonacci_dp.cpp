/**********************************************************
  Fibonacci with Dynamic Programming
  Created by Alexandre Hiroyuki, October 10, 2019.
  https://github.com/AlexandreHiroyuki
**********************************************************/
#include <iostream>
using namespace std;

// Global definition of table and it's size
unsigned long long int *table;
size_t table_size = 2;

// This function returns the value of the nth number of Fibonacci sequence
//
// In order to reduce the complexity, we calculate each value only once and store it on
// a table/array
//
// Complexity is linear on the number of sums needed to calculate the requested value
// or constant for already calculated values
unsigned long long int fibonacci(size_t n)
{
    // If the current size is smaller than the requested value
    if (table_size <= n)
    {
        // Increase the table size
        table = (unsigned long long int *)realloc(table, n * sizeof(unsigned long long int));

        // Calculate all values added to the sequence
        for (size_t i = table_size; i <= n; i++)
        {
            table[i] = table[i - 1] + table[i - 2];
        }

        // Update the index
        table_size = n;
    }

    // Return the result
    return table[n];
}

int main()
{
    // Initialize the table/array with fibonacci values
    table = (unsigned long long int *)calloc(table_size, sizeof(unsigned long long int));
    table[0] = 0;
    table[1] = 1;

    // Loop to input
    size_t input = 1;
    while (input > 0)
    {
        cin >> input;

        // Call fibonacci function
        cout << fibonacci(input) << endl;
    }

    // Free memory occupied by the table/array
    free(table);
    return 0;
}