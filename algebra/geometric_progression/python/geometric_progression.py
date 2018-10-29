# For a geometric progression a + ar + ar^2 + ar^3 + ...
# with a being the scale factor and r being the common ratio


# N-th term
def nth_term(a, r, n):
    return a * (r**(n-1))


# Sum of the first N terms
def sum_of_first_n(a, r, n):
    return (a * (1 - r ** n)) / (1 - r)
