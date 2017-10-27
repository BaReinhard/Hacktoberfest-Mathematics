
def binaryToDecimal(decimal):
    total = 0
    for i, digit in enumerate(decimal[::-1]):
        total = int(digit) * pow(2, i)
    return total

print("Input a binary number to convert to decimal: ")
binaryNum = input()
print(binaryToDecimal(binaryNum))
