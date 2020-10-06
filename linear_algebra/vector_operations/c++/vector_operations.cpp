//A program for testing vector operations.
//Created 5/10/20 by Exonorid

#include <cassert>
#include <cstdio>
#include <cstdlib>

#include "vec2.h"

int main() {
  constexpr vec2 addResult = vec2(1, 3) + vec2(3, 4);
  static_assert(addResult == vec2(4, 7), "Vector addition yielded unexpected result.");

  constexpr vec2 subResult = vec2(3, 4) - vec2(1, 3);
  static_assert(subResult == vec2(2, 1), "Vector subtraction yielded unexpected result.");

  constexpr vec2 scaleResult = vec2(1, 0.5) * 6.28;
  static_assert(scaleResult == vec2(6.28, 3.14), "Vector scaling yielded unexpected result.");

  constexpr vec2 normVec = vec2(3, 4);
  constexpr double mag = magnitude(normVec);
  static_assert(mag == 5, "Magnitude is not the expected value.");

  constexpr vec2 normalized = normVec.normalize();
  static_assert(normalized == vec2(0.6, 0.8), "Vector normalization yielded unexpected result.");
}
