package main

import (
	"fmt"
)

func mean(numbers []int) float64 {
	sum := 0.0
	for _, number := range numbers {
		sum = sum + float64(number)
	}
	return sum / float64(len(numbers))
}

func main() {
	numbers := []int{2, 3, 5, 7, 11, 13}
	fmt.Println(mean(numbers))
}
