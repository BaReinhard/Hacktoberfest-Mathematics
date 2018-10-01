import math

def main():
    print(str(log_pow(2, 3, 10)))

def log_pow(x, p, base):
    return p*math.log(x, base)

if __name__ == "__main__":
    main()