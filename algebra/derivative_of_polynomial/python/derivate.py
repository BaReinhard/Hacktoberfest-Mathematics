def toStringPol(degree, coeff):
	pol = ""
	
	for i in range(degree+1):
		if coeff[i] == 0:
			continue
			
		if i == 0:
			pol += str(coeff[i])
			if degree-i > 1:
				pol += "x^" + str(degree-i)
			elif degree-i == 1:
				pol += "x"
		else:
			if(coeff[i] > 0):
				pol += " + "
				pol += str(coeff[i])
				if degree-i > 1:
					pol += "x^" + str(degree-i)
				elif degree-i == 1:
					pol += "x"
			else:
				pol += " - "
				pol += str(abs(coeff[i]))
				if degree-i > 1:
					pol += "x^" + str(degree-i)
				elif degree-i == 1:
					pol += "x"
	
	if pol == "":
		pol += "0"
	
	return pol

def differentiation(degree, coeff):
	derivate_coeff = []
	
	for i in range(degree+1):
		derivate_coeff.append((degree-i) * coeff[i])
	
	return derivate_coeff

def main():
	degree = int(raw_input("Enter the degree of the polynomial: "))

	coeff = map(int, raw_input("Enter the " + str(degree+1) + " coefficients of the polynomial:\n").split())

	derivate_coeff = differentiation(degree, coeff)

	yourPol = toStringPol(degree, coeff)
	derivate = toStringPol(degree-1, derivate_coeff)

	print "\nYour polynomial: " + yourPol		
	print "The first polynomial derivate: " + derivate

if __name__ == "__main__":
	main()
