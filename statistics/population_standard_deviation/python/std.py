from math import sqrt

def std(l):
    n = len(l)
    mean = sum(l)/n
    sxx = sum([(x-mean)**2 for x in l])
    return sqrt(sxx/n)

def test():
    import numpy as np
    test_array = np.random.randint(0,100,size=100)
    print("This:", std(test_array))
    print("Reference:", np.std(test_array))

if __name__ == '__main__':
    test()
