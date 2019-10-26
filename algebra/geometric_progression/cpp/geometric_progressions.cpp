// including liberaries
#include <iostream>
#include <cmath>
using namespace std;

// class for Geometriv Progressions
class GP
{
  // private members
  int a,r,n; // a =  first vale, r = common ratio
public:
  GP(int, int, int); // prototyping of parameterised constructor
  void print(); // prototyping of print method
  int sum();  // prototyping of sum method
};

// MAIN function
int main()
{
  // created a new object pointer for class gp with value 1 = first term, 2 = common ratio and 10 =
  GP *gp = new GP(1, 2, 10);
  gp->print();
  cout<<"\nsum is "<<gp->sum();
  delete gp;
}
// parameterised constructor of class GP
inline GP::GP(int a,int r,int n)
{
  this->a = a;  // assigning the first term
  this->r = r;  // assigning the commom ratio
  this->n = n;  // assigning the length
}

// method of class GP to print the gp
inline void GP::print()
{
  int a_nth; // declared to calculate and print nth term
  for (int t=0; t < this->n; t++) {
    a_nth =  this->a * pow(this->r, t);  // calculating the nth term as , a_nth = a * r^n-1
    cout<<a_nth<<" ";
  }
}

// function returns the sum of geometric Progressions
inline int GP::sum()
{
  /*
   *  sum_of_a_gp = a * (1 - r^n) / (1 - r)
   *                                        where r > 1
   */
  return  (a * ((1 - pow(this->r, this->n)) / (1 - this->r)));
}
