
a = int(input("Enter the first term value of the A.P. series: "))

n = int(input("Enter the total numbers in the A.P. series: "))

d = int(input("Enter the common difference of A.P. series: "))

SUM = (n * (2 * a + (n - 1) * d)) / 2
Tn = a + (n - 1) * d

print("Sum of the A.P series is: ")

for i in range(a, Tn + 1, d):
    if i != Tn:
        print(str(i) + " + ", end="")
    else:
        print(str(i) + " = " + str(SUM))
