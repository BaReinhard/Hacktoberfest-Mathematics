// Returns the number of ways to arrange r objects from n objects

package main

import "fmt"

func permuatations(r int64, n int64) int64 {

	if (r > n) {
		fmt.Println("Thats invalid")
		return 0
	} else {
		var result int64 = 1

		for i:= (n-r)+1 ; i <= n ; i++ {
			result = result * i 
		}

		return result 
	}

}

func main (){
	fmt.Print("The no of ways to pick 4 objects from 10 is ")
	fmt.Println(permuatations(4,10))
}