"""
   Find the nth root of a and return the integer component only
   @input: number, root
   @output: nth root of number
"""
def nth_root(a,n):
    high = 1
    while high ** n <= a:
        high *= 2
    low = high/2
    while low < high:
        mid = (low + high) // 2
        if low < mid and mid**n < a:
            low = mid
        elif high > mid and mid**n > a:
            high = mid
        else:
            return mid
    return mid + 1
