n=int(
input("Which one do you want? \n 1.Square \n 2. Rectangle \n 3. Triangle \n 4.Circle")
)

if n==1:
  a=int(
  input("Enter Side length for square")
  )
  sqr=a*a
  print(sqr)
elif n==2:
  l=int(
  input("Enter Length for Rectangle")
  )
  b=int(
  input("Enter Breadth for Rectangle")
  )
  rec=l*b
  print(rec)
elif n==3:
  trib=int(
  input("Enter Base length for Triangle")
  )
  h=int(
  input("Enter Height length for Triangle")
  )
  tri=0.5*trib*h
  print(tri)
elif n==4:
  r=int(
  input("Enter Radius length for Circle")
  )
  circle=3.14*(r**2)
  print(circle)
else:
  print("Invalid Entry!")
