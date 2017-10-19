# Use Python v3.* to run
import numpy


# given a dimension n and a basis for R^n (real vector space of dimension n), this process computes an orthonormal
# basis from the given basis using the Gram-Schmidt process. To run with different values, change the values of dim
# and basis in the if __name__ == '__main__' section.
def orthonormalize(n, basis):
    if (not n == len(basis)) or not (n == len(b) for b in basis):
        raise ValueError("dimension does not match basis!")

    if not linearly_independent(basis):
        raise ValueError("original basis not linearly independent!")

    # init empty arrays
    v = [[0] * n] * n
    output = [[0] * n] * n
    for i in range(0, n):
        j = i - 1
        v[i] = basis[i]
        while j >= 0:
            v[i] = sub(v[i], mult(inner_product(basis[i], output[j]), output[j]))
            j -= 1
        output[i] = mult(1 / norm(v[i]), basis[i])
    return output


def mult(c, v2):
    output = [0] * len(v2)
    for i in range(0, len(v2)):
        output[i] = c * v2[i]
    return output


def linearly_independent(vectors):
    # if any eigenvalue is 0, then the vectors are not linearly independent.
    # This is definitely not the most efficient method to do this, but it is pretty easy.
    eigenvalues, eigenvectors = numpy.linalg.eig(vectors)
    if 0.0 in numpy.absolute(eigenvalues):
        return False
    return True


def sub(v1, v2):
    output = [0] * len(v1)
    for i in range(0, len(v1)):
        output[i] = v1[i] - v2[i]
    return output


def inner_product(v1, v2):
    output = 0
    for i in range(0, len(v1)):
        output += v1[i] * v2[i]
    return output


def norm(v):
    return numpy.sqrt(inner_product(v, v))


if __name__ == '__main__':
    # example dimension
    dim = 3

    # example original basis
    basisExample = [[3.0, 1.0, 4.0], [2.0, 5.0, 6.0], [1.0, 4.0, 8.0]]

    print(orthonormalize(dim, basisExample))
