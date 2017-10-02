import math


def quadratic_formula(a, b, c):

    discrimiant = b**2 - (4 * a * c)

    if discrimiant < 0:
        return "This equation does not have a real solution"
    elif discrimiant == 0:
        return (-b + math.sqrt(discrimiant)) / 2 * a
    else:
        answers = {}
        answers["solution_one"] = (-b + math.sqrt(discrimiant)) / (2 * a)
        answers["solution_two"] = (-b - math.sqrt(discrimiant)) / (2 * a)
        return answers
