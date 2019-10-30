main = do
    putStrLn "Enter the three sides of the triangle:"
    a <- readLn :: IO Float
    b <- readLn :: IO Float
    c <- readLn :: IO Float
    putStrLn $ "The area of the triangle is " ++ (show (area a b c ((a + b + c) / 2)))

area :: Float -> Float -> Float -> Float -> Float
area a b c s = sqrt (s * (s - a) * (s - b) * (s - c))
