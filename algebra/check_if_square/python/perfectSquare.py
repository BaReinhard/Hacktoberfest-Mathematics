'''
Funtion to check number is
perfect square or not
'''
# Import Math Library
import math as m

# Function to Check Perfect Squares
def perfect_squares(user_input):
  if m.sqrt(user_input) * m.sqrt(user_input) == user_input:
    print('Perfet Square')
  else:
    print('Not Perfect Square')

# Taking User Input
user_input = int(input('Enter Number\n'))

# Calling Perfect Square Function
perfect_squares(user_input)
