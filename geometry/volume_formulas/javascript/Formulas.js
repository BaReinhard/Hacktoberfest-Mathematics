const cilinderVol = (baseRadius,height) => Math.pow(baseRadius,2)*Math.PI*height;
const cubeVol = (edge) => Math.pow(edge,3);
const sphereVol = (radius) => (4/3)*Math.PI*Math.pow(radius,3);
const prismVol = (baseArea,edge3) => baseArea*edge3;
const pyramidVol = (baseArea,height) =>  (baseArea*height)/3;