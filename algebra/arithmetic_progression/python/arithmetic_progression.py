# For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
# with a being the initial term and d being the common difference

# This function calculates the nth term
def nth_term(a, d, n):
    '''Return the nth term of an AP with first term a, common difference d.
    >>> nth_term(1, 1, 1)
    1
    >>> nth_term(2, 4, 6)
    22
    >>> nth_term(3.1, 5.5, 6.667)
    34.268499999999996
    '''
    return a + (n - 1) * d

# This function calculates the sum of the first n terms
def sum_of_first_n(a, d, n):
    '''Return the sum of first n terms of an AP with first term a, common difference d.
    >>> sum_of_first_n(1, 1, 1)
    1.0
    >>> sum_of_first_n(2, 4, 6)
    72.0
    >>> sum_of_first_n(3.1, 5.5, 6.667)
    124.56789475
    '''
	  return ((n) * ((2 * a) + (n - 1) * d)) / 2
    
if __name__ == "__main__":
    import doctest
    doctest.testmod()
