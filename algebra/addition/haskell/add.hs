main = do
    putStrLn "Enter first number"
    a <- readLn :: IO Int
    putStrLn "Enter second number"
    b <- readLn :: IO Int
    putStrLn $ (show a) ++ " + " ++ (show b) ++ " = " ++ (show (a + b))
