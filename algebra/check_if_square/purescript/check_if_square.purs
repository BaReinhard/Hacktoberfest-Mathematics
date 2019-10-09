module Main where

import Prelude

import Control.Monad.Eff (Eff)
import Control.Monad.Eff.Console (CONSOLE, log)
import Math (round, sqrt)

roundRoot :: Number -> Number
roundRoot = round <<< sqrt

value :: Number
value = 65.0

isSquare :: Number -> Boolean
isSquare number = (roundRoot number * roundRoot number) == number

main :: forall e. Eff (console :: CONSOLE | e) Unit
main = do
  log <<< show <<< isSquare $ value
