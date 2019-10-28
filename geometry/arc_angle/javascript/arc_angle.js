/*
    arc_angle
    
    @input: radius of circle, length of arc
    @output: angle of arc
*/

function arc_angle(arc_len, radius){
    let angle = (360*parseFloat(arc_len))/(Math.PI*2*parseFloat(radius))
    
    return angle
}

console.log(arc_angle(1,2));