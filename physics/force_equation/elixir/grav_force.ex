defmodule GravitationalForce do
  @g 6.67 * :math.pow(10, -11)

  def gravitational_force(mass_obj_1, _mass_obj_2, _distance_between_objects) when mass_obj_1 <= 0, do: { :error, "Mass should be greater than 0"}
  def gravitational_force(_mass_obj_1, mass_obj_2, _distance_between_objects) when mass_obj_2 <= 0, do: { :error, "Mass should be greater than 0"}
  def gravitational_force(_mass_obj_1, _mass_obj_2, distance_between_objects) when distance_between_objects <= 0, do: { :error, "Distance should be greater than 0"}
  def gravitational_force(mass_obj_1, mass_obj_2, distance_between_objects) do
    (@g * mass_obj_1 * mass_obj_2 ) / ( distance_between_objects * distance_between_objects )
  end
end
