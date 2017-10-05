function euclidianDistance(p1,p2) {
    var dX = p1.x - p2.x;
    var dY = p1.y - p2.y;
    return Math.sqrt(dX ** 2 + dY ** 2);    
}

function test() {
    var p1 = {
        "x" : 0,
        "y" : 0        
    };
    
    var p2 = {
        "x" : 1,
        "y" : 1        
    };
    
    return euclidianDistance(p1,p2);
}

//console.log(test());
