import math

def main():
    print(str(log_prod(2, 3, 10)))

def log_prod(x, y, base):
    return math.log(x, base) + math.log(y, base)


if __name__ == "__main__":
    main()