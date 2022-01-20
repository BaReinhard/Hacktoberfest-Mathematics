function nthroot(x, n) {
    ng = n % 2;
    if ((ng == 1) || x < 0)
        x = -x;
    var r = Math.pow(x, 1 / n);
    n = Math.pow(r, n);

    if (Math.abs(x - n) < 1 && (x > 0 === n > 0))
        return ng ? -r : r;
}
console.log(nthroot(16, 2));
console.log(nthroot(81, 4));