def symmetric_group(n):
    if n == 1:
        return set([tuple([1])])
    S = set()
    T = symmetric_group(n-1)
    for i in range(n):
        for t in T:
            l = list(t)
            if i < n-1:
                l.append(l[i])
                l[i] = n
            else:
                l.append(n)
            S.add(tuple(l))
    return S
