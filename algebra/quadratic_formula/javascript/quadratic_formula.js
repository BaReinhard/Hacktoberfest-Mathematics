function quadraticFormula(a, b, c){
    "use strict";
    
    var discriminant = Math.pow(b, 2) - (4 * a * c);
    if (discriminant < 0){
        return "This equation has no real solutions";
    }
    
    else if (discriminant === 0){
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }
    
    else {
        var solution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        var solution2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return {
            "Solution_1": solution1,
            "Solution_2": solution2
        };
    }
}
