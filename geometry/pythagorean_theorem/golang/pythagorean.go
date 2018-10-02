package main

import (
	"fmt"
	"math"
)

// findHypotenuse finds the hypotenuse given two sides,
// a and b, of a right triange.
func findHypotenuse(a float64, b float64) float64 {
	return math.Sqrt(a*a + b*b)
}

func main() {
	fmt.Println(findHypotenuse(3, 4))
}
