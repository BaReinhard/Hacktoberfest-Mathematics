defmodule Ackermann do
  @moduledoc """
  Calculates Ackermann of a given pair of numbers
  """

  @spec of(non_neg_integer, non_neg_integer) :: non_neg_integer
  def of(0, n), do: n + 1
  def of(m, 0) when m > 0, do: of(m-1, 1)
  def of(m, n) when m > 0 and n > 0, do: of(m - 1, of(m, n - 1))
end
