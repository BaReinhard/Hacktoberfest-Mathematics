/**
 * Calculate the unique prime factorization for an integer
 * To test: go run prime_factorization.go
 */

package main

import (
	"fmt"
	"math"
	"sort"
	"strconv"
	"strings"
)

func factorize(n int) (prime bool, f1, f2 int) {
	for i := int(math.Sqrt(float64(n))); i > 1; i-- {
		if n%i == 0 {
			f1 = i
			f2 = n / i
			return
		}
	}
	prime = true
	return
}

func primeFactorize(n int, series chan int) chan int {
	prime, f1, f2 := factorize(n)
	if prime {
		series <- n
	} else {
		go primeFactorize(f1, series)
		go primeFactorize(f2, series)
	}
	return series
}

// Calculate the unique set of prime factors for a number
func CalculatePrimeFactorization(target int) []int {
	series := make(chan int, 99999)
	factors := make([]int, 0)
	travel := 1
	for prime := range primeFactorize(target, series) {
		factors = append(factors, prime)
		travel *= prime
		if travel == target {
			break
		}
	}
	sort.Ints(factors)
	return factors
}

func main() {
	var target int
	fmt.Scanf("%v", &target)
	primes := CalculatePrimeFactorization(target)
	primesStr := make([]string, 0, len(primes))
	for _, prime := range primes {
		primesStr = append(primesStr, strconv.Itoa(prime))
	}
	fmt.Println(strings.Join(primesStr, " "))
}
