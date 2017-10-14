// include headers and libs
#include <iostream>
#include <cmath>
using namespace  std;

/*
  this repo contains functions like cube_root, square_root, digit_sum

  THE TYPE OF DATA I AM CHOOSING IS INT
*/

class arithmetic        // an arithmetic class for some functions that are implemented on the number
{
  // given public access so that it can be used out side the class
public:
  // static function used so that we don;t have to define the object

  /*
      returns the cube root of a number
  */
  static int cube_root(int val)
  {
    if (val < 0)  // return -ve cube root for -ve numbers else return +ve cube root
      return -cbrt(val);
    else
      return cbrt(val);
  }

  /*
      returns the square root of a number
  */
  static int square_root(int val)
  {
      return sqrt(val); // gives the wrong value if value < 0 and also return the value in whole number
  }

  /*
      returns the sum of digits of a number
  */
  static int digit_sum(int value) // returns the sum of digits of a number
  {
    int sum = 0;   // a value declared to store the sum and initialised to 0

    // loop body will be executed untill and unless all numbers are being traversed
    while(value!=0)
    {
      sum += value % 10;   // adding sum -> previous addition with new number
      value /= 10;    // dividing by 10 to get new number
    }

    return sum; // returning the sum
  }
};

int main() {

  // declaring and initialising the variable
  int value;
  value = 169;

  // printing desired value from desired functions and printing line by line
  cout<<"cube root of "<<value<<" : "<<arithmetic::cube_root(value)<<endl;
  cout<<"square root of "<<value<<" : "<<arithmetic::square_root(value)<<endl;
  cout<<"sum of "<<value<<" : "<<arithmetic::digit_sum(value)<<endl;


  // return 0 to OS for successful execution
  return 0;
}
