#!/usr/bin/env python


def polynomial_derivative(degree, coefficients):
    for i in range(degree):
        coefficients[i] *= i #Multiply coefficient by index
    coefficients.pop(0)
    return degree - 1, coefficients

def polynomial_show(degree, coefficients):
    string_representation = ""
    for i in range(degree):
        coefficient = coefficients[i]
        
        if i != 0:
            if coefficients[i] >= 0:
                string_representation += " + "
            else:
                string_representation += " - "
                coefficient = abs(coefficient)
        
        string_representation += f"{coefficient}x^{i}"
    return string_representation

if __name__ == '__main__':
    degree = int(input("Enter degree of polynomial (highest power):"))+1
    coefficients = []
    for i in range(degree):
        coefficient = int(input(f"Enter the coefficient at the x^{i} term:"))
        coefficients.append(coefficient)
    
    print("Original:")
    print(polynomial_show(degree, coefficients))
    
    degree, coefficients = polynomial_derivative(degree, coefficients)
    
    print("Derivative:")
    print(polynomial_show(degree, coefficients))
    
    
