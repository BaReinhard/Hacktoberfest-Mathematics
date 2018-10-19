def nDimentionDist(pointA, pointB):#points A and B being the two points in n did, both poinyA and pointB are list n arrays, where n is thr number of dimensions
  dist= 0
  
  #generalised pythagoream theorem over n dimensions
  for i in range(len(pointA)):
    dist += (pointA[i] - pointB[i])**2
  return(dist**0.5)
