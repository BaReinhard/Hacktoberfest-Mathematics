def modulus(first, second):
  """Divides the second number from the first and returns remainder"""
  if second == 0:
    print str(second) + " cannot be zero"
  else:
    return first%second


if __name__ == "__main__":
  modulus(3, 3)
  
