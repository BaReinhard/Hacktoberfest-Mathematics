"""
For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
with a being the initial term and d being the common difference
"""


def nth_term(a, d, n):
    """ This function calculates the N-th term """
    return a + (n - 1) * d


def sum_of_first_n(a, d, n):
    """ This function calculates the sum of the first N terms """
    return ((n) * ((2 * a) + (n - 1) * d)) / 2
