def factorial(n)
  if n.zero?
    1
  else
    n * factorial(n-1)
  end
end
