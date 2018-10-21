def area(base, height):
    return (base*height)/2
end

def perimeter(side1, side2, side3)
    side1 + side2 + side3
end

def side_type(side1, side2, side3)
    if [side1, side2, side3].uniq.count == 1
        return "equilateral"
    else [side1, side2, side3].uniq.count == 2
            return "isosceles"
    else
            return "scalene"
    end
end
