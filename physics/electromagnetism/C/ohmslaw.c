#include <stdio.h>

    float ohmsLaw (float Voltage, float Current){
float Resistance= Voltage / Current;
    return Resistance;
  } int main(int argc, char const *argv[]) {

float Result = ohmsLaw(78,8);
printf("Resistance is : %lf\n", Result );
    return Result ;
  }
