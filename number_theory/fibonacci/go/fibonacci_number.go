
// O(2^n) time | O(n) space

package program

func GetNthFib(n int) int {
	if n == 2 {
		return 1
	} else if n == 1 {
		return 0
	}
	return GetNthFib(n-1) + GetNthFib(n-2)
}
