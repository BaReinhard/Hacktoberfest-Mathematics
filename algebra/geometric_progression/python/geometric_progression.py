#!/usr/bin/env python

# For a geometric progression a + ar + ar^2 + ar^3 + ...
# with a being the scale factor and r being the common ratio

# This function calculates the nth term
def nth_term(a, r, n):
    return  a * (r ** (n - 1));

# This function calculates the sum of the first n terms
def sum_of_first_n(a, r, n):
    return (a * (1-r**n)) / (1 - r)


if __name__ == '__main__':
    a = float(input("Enter scale factor:"))
    r = float(input("Enter common ratio:"))
    n = int(input("Enter the term to calculate:"))
    print(f"The {n} term ({a})({r}^({n}-1)) is {nth_term(a, r, n)}")
    print(f"The sum of the first {n} terms is {sum_of_first_n(a, r, n)}")
