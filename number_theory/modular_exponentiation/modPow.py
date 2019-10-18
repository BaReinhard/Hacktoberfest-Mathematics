mod=1000000007
def modPOW(a,b):
	res=1
	while b:
		if b&1:
			res=(res*a)%mod
		a=(a*a)%mod
		b>>=1
	return res%mod

ans=modPOW(ans,n)
print(ans)
