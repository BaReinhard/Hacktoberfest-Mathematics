module Main where

import Prelude

import Control.Monad.Eff (Eff)
import Control.Monad.Eff.Console (CONSOLE, log)

fact :: Int -> Int -> Int
fact n acc
  | n > 1 = fact (n - 1) (acc * n)
  | otherwise = acc


main :: forall e. Eff (console :: CONSOLE | e) Unit
main = do
  log <<< show $ fact 25 1
