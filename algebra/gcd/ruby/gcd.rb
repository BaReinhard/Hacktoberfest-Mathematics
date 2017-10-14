def euclid_gcd(a,b)
    if(a < b)
        return euclid_gcd(b,a)
    end
    while (b != 0)
        temp = a
        a = b
        b = temp % a
    end
    return a
end
