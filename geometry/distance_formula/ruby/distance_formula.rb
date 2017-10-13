include Math
require 'cmath'

def distance_formula(point_1, point_2)

  distance = CMath.sqrt((point_1[0]-point_2[0])^2 + (point_1[1]-point_2[1])^2)
  distance

end


p1 = [10, 0]
p2 = [10, 0]

puts "distance between point_1 and point_2 is  #{distance_formula(p1, p2)}"
