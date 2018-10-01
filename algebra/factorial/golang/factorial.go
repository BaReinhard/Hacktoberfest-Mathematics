// Computes the factorial of a number

package main

import "fmt"

func factorial(x int64) int64{
	if (x==0 || x==1){
		return 1
	} else{
		result := x * factorial(x-1)
		return result
	}
}

func main(){
	fmt.Print("The factorial of 5 is ")
	fmt.Println(factorial(5))
}