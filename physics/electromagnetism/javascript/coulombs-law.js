function coulomb(q1, q2, r) {
  const ELECTRICITY_CONST = 9*10**9;

  return ELECTRICITY_CONST * q1 * q2 / r**2;
}