defmodule ForceEquation do
  @doc """
  Calculate the force given an object's mass and acceleration
  """
  @spec force(number, number) :: number
  def force(mass, acceleration), do: mass * acceleration
end
