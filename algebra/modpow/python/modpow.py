def modpow(base, power, mod):
    res = 1
    while(power > 0):
        if(power & 1 == 1):
          res = (res * base) % mod
        base = (base * base) % mod
        power >>= 1
    return res % mod