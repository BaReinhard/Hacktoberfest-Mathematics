module Main where

import Prelude

import Control.Monad.Eff (Eff)
import Control.Monad.Eff.Console (CONSOLE, log)
import Math (pow)

nthTerm :: Number -> Number -> Number -> Number
nthTerm a r n = a * pow r (n - 1.0)

sumNthTerm :: Number -> Number -> Number -> Number
sumNthTerm a r n = a * (1.0 - pow r n) / (1.0 - r)

main :: forall e. Eff (console :: CONSOLE | e) Unit
main = do
  log <<< show $ nthTerm 1.0 2.0 10.0
  log <<< show $ sumNthTerm 1.0 2.0 10.0
