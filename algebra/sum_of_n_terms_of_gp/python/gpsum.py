first = float(raw_input("Enter the first term of the GP: "))
ratio = float(raw_input("Enter the Commom ratio of the GP: "))
nth_term = float(raw_input("Enter the numbers of terms: "))

sum = (a*(1-(r**n)))/(1-r)

print "The sum of the %.0f terms is %f." % (nth_term, sum)
