// Find if a given number is prime or not
function isPrime (n) {
  let f = 0
  for (let i = 1; i <= n; i++) {
    if (n % i === 0) f++
  }
  if (f === 2) return 1
  else return 0
}

// Generate prime numbers
function * primeNumbers () {
  for (let i = 2; ; i++) {
    if (isPrime(i)) yield i
  }
}

// Print prime factors of a number
function primeFactors (n) {
  let factors = primeNumbers()
  while (n > 1) {
    let i = factors.next().value
    while (n % i === 0) {
      console.log(i)
      n /= i
    }
  }
}

primeFactors(90)
