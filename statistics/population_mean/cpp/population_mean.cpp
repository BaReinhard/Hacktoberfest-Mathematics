#include <iostream>
#include <math.h>
#include <vector>

using namespace std;

double mean(vector<int> numbers) {
  int sum = 0;
  int leng = numbers.size();
  for(int i = 0; i < leng; ++i) {
    sum += numbers[i];
  }
  return double(sum)/max(leng, 1);
}


int main() {
  vector<int> numbers;
  numbers.push_back(77);
  numbers.push_back(80);
  cout << mean(numbers);
  return 0;
}
