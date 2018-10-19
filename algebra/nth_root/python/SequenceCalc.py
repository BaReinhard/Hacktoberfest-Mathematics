##Calculates the a and b values in the nth formula
##by parsing a sequence list
##Formula = an+b
def getLinearFormula(numbers):
    output=[]
    a=numbers[1]-numbers[0]
    a1=numbers[2]-numbers[1]
    if a1==a:
        b=numbers[0]-a
        output[0]=a
        output[1]=b
        return a,b
    else:
        ##Sequence not linear
        print("Sequence is not linear")


