// Code to perfom the following functions
// 1. Squareroot
// 2. Cuberoot
// 3. Digit Sum

package main

import (
	"fmt"
	"math"
)

func square_root(x int) float64 {
	return math.Pow(float64 (x) , 0.5);
}

func cube_root(x int) float64 {
	return math.Pow(float64 (x) , 1.0/3.0);
}

func digit_sum(x int) int {
	result := 0
	for ; x>0; {
		result += x % 10
		x = x / 10
	}

	return result;
}

func main(){
	fmt.Print("The sum of digits of 1334: ")
	fmt.Println(digit_sum(1334))

	fmt.Print("The square root of 4 is ")
	fmt.Println(square_root(4))
	
	fmt.Print("The cube root of 27 is ")
	fmt.Println(cube_root(27))
}