def __slope__(x1, y1, x2, y2):
    num1 = x1 - x2
    num2 = y1 - y2
    return (num1 * num2)/(num1 * num1)

if __name__ == "__main__":
    print(__slope__(1, 2, 3, 4))
