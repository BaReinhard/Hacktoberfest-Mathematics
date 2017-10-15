def first_n_fibonacci(n, zero_start=True):
  sequence = []
  a, b = 0, 1
  for x in range(n):
    if zero_start:
      sequence.append(a)
    else:
      sequence.append(b)
    a, b = b, a + b
  return sequence


print first_n_fibonacci(9)
