'use strict';

const euclid_gcd = (a, b) => {
    if(a < b) {
        return euclid_gcd(b, a)
    }
    while(b!=0) {
        const temp = a;
        a = b;
        b = temp%b;
    }
    return a;
}
