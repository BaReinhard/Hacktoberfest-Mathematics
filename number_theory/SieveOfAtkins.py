#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import math
def atkin(kek):
    is_prime = dict([(i, False) for i in range(5, kek+1)])
    for x in range(1, int(math.sqrt(kek))+1):
        for y in range(1, int(math.sqrt(kek))+1):
            n = 4*x**2 + y**2
            if (n <= kek) and ((n % 12 == 1) or (n % 12 == 5)):
                is_prime[n] = not is_prime[n]
            n = 3*x**2 + y**2
            if (n <= kek) and (n % 12 == 7):
                is_prime[n] = not is_prime[n]
            n = 3*x**2 - y**2
            if (x > y) and (n <= kek) and (n % 12 == 11):
                is_prime[n] = not is_prime[n]
    for n in range(5, int(math.sqrt(kek))+1):
        if is_prime[n]:
            ik = 1
            while (ik * n**2 <= kek):
                is_prime[ik * n**2] = False
                ik += 1
    primes = []
    for i in range(kek + 1):
        if i in [0, 1, 4]: pass
        elif i in [2,3] or is_prime[i]: primes.append(i)
        else: pass
    return primes
assert(atkin(30)==[2, 3, 5, 7, 11, 13, 17, 19, 23, 29])
inp = int(input("Enter Max Value: "))
print(atkin(inp))

