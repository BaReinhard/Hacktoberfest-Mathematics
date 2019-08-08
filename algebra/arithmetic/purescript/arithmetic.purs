module Main where

import Prelude

import Control.Monad.Eff (Eff)
import Control.Monad.Eff.Console (CONSOLE, log)
import Math (pow, sqrt)

getSqrRoot :: Number -> Number
getSqrRoot = sqrt

getCubeRoot :: Number -> Number
getCubeRoot = flip pow (1.0/3.0)

sumOfDig :: Int -> Int -> Int
sumOfDig 0 acc = acc
sumOfDig n acc = sumOfDig (div n 10) (acc + mod n 10)

sumDigits :: Int -> Int
sumDigits = (flip sumOfDig) 0

main :: forall e. Eff (console :: CONSOLE | e) Unit
main = do
  log <<< show <<< getSqrRoot $ 25.0
  log <<< show <<< getCubeRoot $ 27.0
  log <<< show <<< sumDigits $ 12345
