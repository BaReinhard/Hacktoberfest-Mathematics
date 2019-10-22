factorial :: Double -> Double
factorial 0 = 1
factorial n = n * factorial (n-1)

combination :: Double -> Double -> Double
combination n r = factorial n / (factorial r * factorial (n-r))
