##Script to calculate quadratic formula coeffcients from a list of numbers
##04/10/17
def findLinearFormula(numbers):
    output=[]
    a=numbers[1]-numbers[0]
    a1=numbers[2]-numbers[1]
    if a1==a:
        b=numbers[0]-a
        return (a,b)
    else:
        print("Sequence is not linear")

def getQuadraticFormula(numbers):
    first_difference=[]
    second_difference=[]
    for i in range(3):
        gradient=numbers[i+1]-numbers[i]
        first_difference.append(gradient)
        
    for i in range(2):
        gradient=first_difference[i+1]-first_difference[i]
        second_difference.append(gradient)

    if second_difference[0]==second_difference[1]: ##Checks for consistency
        a=second_difference[0]/2
        subs_diff=[]
        for i in range(4):
            n=i+1
            num=a*(n*n)
            subs_diff.append((numbers[i])-num)

        b,c=findLinearFormula(subs_diff)
        return (a,b,c)
    else:
        print("Sequence is not quadratic")

