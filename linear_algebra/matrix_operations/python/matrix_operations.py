def add_matrix(A, B):
    assert len(A) == len(B) and len(A[0]) == len(B[0])
    C = [[0]*len(A[0]) for i in range(len(A))]
    for i in range(len(A)):
        for j in range(len(A[0])):
            C[i][j] = A[i][j] + B[i][j]
    return C


def multiply_matrix(A, B):
    assert len(A[0]) == len(B)
    C = [[0]*len(B[0]) for i in range(len(A))]
    for i in range(len(A)):
        for j in range(len(B[0])):
            C[i][j] = 0
            for k in range(len(B)):
                C[i][j] += A[i][k] * B[k][j]
    return C


def multiply_scalar(A, k):
    C = [[0]*len(A[0]) for i in range(len(A))]
    for i in range(len(A)):
        for j in range(len(A[0])):
            C[i][j] = A[i][j] * k
    return C
