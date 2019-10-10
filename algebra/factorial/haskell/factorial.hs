main :: IO ()
main = do
    n <- readLn :: IO Int
    print $ factorial n


factorial :: Int -> Int
factorial 0 = 1
factorial n = n * factorial (n - 1)