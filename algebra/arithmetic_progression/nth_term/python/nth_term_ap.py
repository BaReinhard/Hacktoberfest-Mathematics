# For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
# with a being the initial term and d being the common difference

def nth_term(a, d, n):
    '''Return the nth term of an AP with first term a, common difference d.
    >>> nth_term(1, 1, 1)
    1
    >>> nth_term(3.1, 5.5, 6.667)
    34.268499999999996
    '''
    return a + (n - 1) * d
