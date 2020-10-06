//A header that provides a 2D vector struct as well as some utility functions
//Created 5/10/20 by Exonorid

#ifndef HKTBFEST_VEC2
#define HTKBFEST_VEC2

#include <cmath>

struct vec2 {
private:
  double x;
  double y;
public:
  constexpr vec2(double x1, double y1) : x(x1), y(y1) {}

  const constexpr double getX() const { return x; }

  const constexpr double getY() const { return y; }

  const constexpr vec2 operator~() const {
    return vec2(-x, -y);
  }

  const constexpr vec2 operator+(const vec2 &other) const {
    return vec2(x + other.getX(), y + other.getY());
  }

  const constexpr vec2 operator-(const vec2 &other) const {
    return vec2(x - other.getX(), y - other.getY());
  }

  const constexpr vec2 operator*(const double scalar) {
    return vec2(x * scalar, y * scalar);
  }

  const constexpr bool operator==(const vec2 &other) const {
    return (x == other.getX()) && (y == other.getY());
  }

  constexpr const vec2 normalize() const;
};

constexpr double magnitude(const vec2 &vec) {
  double x = vec.getX();
  double y = vec.getY();
  return sqrt((x * x) + (y * y));
}

constexpr const vec2 vec2::normalize() const {
  const vec2 &self = *this;
  double mag = magnitude(self);
  return vec2(x / mag, y / mag);
}

#endif
