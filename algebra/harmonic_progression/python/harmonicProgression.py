# A script to calculate the nth term and sum of harmonic progression to 'n' terms given
# the first term and the common difference of corresponding arithmetic progression


def harmonic_sum(a0, d, n):
    
    h_sum = 0

    for counter in range(0, n):
        h_sum = h_sum + (1 / (a0 + counter * d))

    return h_sum

def harmonic_term(a0, d, n):

    h_term = 1 / (a0 + (n - 1) * d)

    return h_term

value_zero = float(input("Enter the starting/initial value of HP: "))
difference = float(input("Enter the common difference for corresponding AP: "))
term_no = int(input("Enter the term till where you want to calculate: "))
choice = int(input("Enter the number of choice: 1. Sum 2. Term 3. None "))

if choice == 1:

    print("Sum of harmonic series is: " + str(harmonic_sum(value_zero, difference, term_no)))

elif choice == 2:

    print("The " + str(term_no) + "th term is: " + str(harmonic_term(value_zero, difference, term_no)))

else:

    print("End of program")

