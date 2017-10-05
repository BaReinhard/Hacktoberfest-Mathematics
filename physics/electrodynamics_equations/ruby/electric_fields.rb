class ElectricFields

  E_FIELD_CONST = 8.854e-1

  def field_of_homogeneous_sphere_at(electric_charge, radius)
    return if radius <= 0
    (electric_charge)/(4*Math::PI*E_FIELD_CONST*(radius*radius))
  end

  def field_of_ladder_at(line_charge_density, distance)
    return if distance <= 0
    (line_charge_density)*(1/(2*Math::PI*E_FIELD_CONST*distance))
  end

  def field_of_plane(plane_charge_density)
    0.5*(plane_charge_density/E_FIELD_CONST)
  end

  def field_of_plate_capacitor(voltage, distance)
    return if distance <= 0
    voltage/distance
  end

end