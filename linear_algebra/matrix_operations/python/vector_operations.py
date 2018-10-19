from __future__ import print_function
import math


def magnitude(vector):
    mag = math.sqrt(sum([elem * elem for elem in vector]))
    return mag


def add(vector1, vector2):
    assert len(vector1) == len(vector2)
    sum_vector = [elem1 + elem2 for elem1, elem2 in zip(vector1, vector2)]
    return sum_vector


def scale(vector, scalar):
    scaled_vector = [scalar * elem for elem in vector]
    return scaled_vector


def dot(vector1, vector2):
    assert len(vector1) == len(vector2)
    dot_product = sum([elem1 * elem2 for elem1, elem2 in zip(vector1, vector2)])
    return dot_product


if __name__ == '__main__':
    vector1 = [1, 2, 3, 4]
    vector2 = [5, 6, 7, 8]
    print(magnitude(vector1))
    print(add(vector1, vector2))
    print(scale(vector1, 2))
    print(dot(vector1, vector2))
