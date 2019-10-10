def tetrahedral_series(N):
    s=0
    for i in range(1,N+1):
        s+=(i*(i+1)*(i+2))//6
        
    print(s)   

N=int(input())
tetrahedral_series(N)
