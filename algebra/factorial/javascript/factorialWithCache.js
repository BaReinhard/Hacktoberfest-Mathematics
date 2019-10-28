function factorialWithCache(n, cache = {0: 1}) {
  if (n in cache) {
    return cache[n];
  } else {
    cache[n] = n * factorialWithCache(n - 1, cache);
  }
  return cache[n];
}