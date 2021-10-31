const pyramid = length => width => height =>
  width * length +
  length * Math.sqrt((width / 2) ** 2 + height ** 2) +
  width * Math.sqrt((length / 2) ** 2 + height ** 2);
