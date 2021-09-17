from math import pow

def fermat_little(x):
	if x == 2:
		return True
	if not x & 1:
		return False

	return pow(2, x-1, x) == 1