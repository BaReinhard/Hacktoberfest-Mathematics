main = do
    putStr "Enter the number whose factorial is to found : "
    n <- readLn :: IO Int
    putStrLn $ "Factorial of " ++ (show n) ++ " is: " ++ (show (factorial n))

factorial :: Int -> Int
factorial 0 = 1
factorial n = n * factorial (n - 1)
