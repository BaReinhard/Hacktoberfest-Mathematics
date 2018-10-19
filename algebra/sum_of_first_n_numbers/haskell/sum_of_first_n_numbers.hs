-- Function declaration
sum_of_first_n_numbers :: Integer -> Integer;
-- Base cases
sum_of_first_n_numbers 0 = 0;
sum_of_first_n_numbers 1 = 1;
-- Recursive function call
sum_of_first_n_numbers n = n + (sum_of_first_n_numbers(n-1));