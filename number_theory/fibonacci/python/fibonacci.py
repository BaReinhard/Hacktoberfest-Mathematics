def exp_2x2_by_squaring(m, n):
    if n == 0:
        return [[1,0],[0,1]]
    if n == 1:
        return m
    if n % 2 == 0:
        a = m[0][0]
        b = m[0][1]
        c = m[1][0]
        d = m[1][1]
        return exp_2x2_by_squaring([[a*a + b*c, a*b + b*d], [c*a + d*c, c*b + d*d]], n // 2)
    else:
        a = m[0][0]
        b = m[0][1]
        c = m[1][0]
        d = m[1][1]
        temp = exp_2x2_by_squaring([[a*a + b*c, a*b + b*d], [c*a + d*c, c*b + d*d]], (n - 1) // 2)
        a2 = temp[0][0]
        b2 = temp[0][1]
        c2 = temp[1][0]
        d2 = temp[1][1]
        return [[a*a2 + b*c2, a*b2 + b*d2], [c*a2 + d*c2, c*b2 + d*d2]]

def fibonacci(n):
    if n < 0:
        return -1
    if n == 0 or n == 1:
        return 1
    m = [[1, 1], [1, 0]]
    return exp_2x2_by_squaring(m, n)[0][1]
