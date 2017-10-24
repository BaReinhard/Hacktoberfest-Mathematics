def get(ar):
    c = ar[0]
    for i in range (n):   
        d = ar[i]
        z = hcf(c,d)
        c = z
    y = lcm(ar)
    return y,z

def hcf(c,d):
    j = (min(c,d)+1)
    for i in range (1,j):
        if c%i==0:
            if d%i==0:
                z = i
    return z
def lcm(ar):
    c = ar[0]
    for i in range (n):
        d = ar[i]
        z = hcf(c,d)
        y = (c*d)//z
        c = y
    return y

n = int(input().strip())
ar = list(map(int,input().strip().split(' ')))
lcm , hcf = get(ar)
print ("LCM:"+str(lcm))
print ("HCF:"+str(hcf))
 