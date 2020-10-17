def add(first,second):
  """Adds two numbers"""
  return first + second

def sum(numList):
  result=0
  for i in range(len(numList)):
    result+=numList[i]
  return result

if __name__ == "__main__":
  add(2,3)
