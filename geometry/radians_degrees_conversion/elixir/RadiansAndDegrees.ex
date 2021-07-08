defmodule RadiansAndDegrees do
  def degreesToRadians(degrees) do
    degrees * :math.pi() / 180
  end
  def radiansToDegrees(radians) do
      radians * 180 / :math.pi()
  end
end
