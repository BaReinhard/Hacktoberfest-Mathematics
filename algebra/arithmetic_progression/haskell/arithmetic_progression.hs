-- For an arithmetic progression a + (a + d) + (a + 2d) + (a + 3d) + ...
-- with a being the initial term and d being the common difference

-- This function calculates the nth term
nth_term :: Int -> Int -> Int -> Int    
nth_term a d n = a + (n - 1) * d

-- This function calculates the sum of the first n terms
sum_of_first_n :: Fractional a => a -> a -> a -> a
sum_of_first_n a d n = n / 2 * (2 * a + (n - 1) * d)