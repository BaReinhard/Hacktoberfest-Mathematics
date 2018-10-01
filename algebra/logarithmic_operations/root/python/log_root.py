import math

def main():
    print(str(log_root(2, 3, 10)))

def log_root(x, r, base):
    return math.log(x, base)/r

if __name__ == "__main__":
    main()