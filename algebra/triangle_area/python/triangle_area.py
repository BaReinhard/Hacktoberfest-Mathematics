import math

def triangle_area(side1, side2, side3):
    semi_perimeter = (side1+side2+side3)/2
    return math.sqrt(semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3))

if __name__=="__main__":
    print("Enter Side 1")
    side1 = float(input())
    print("Enter Side 2")
    side2 = float(input())
    print("Enter Side 3")
    side3 = float(input())
    print("Area is ")
    print(triangle_area(side1,side2,side3))
