function quadratic_formula(a, b, c){

    discrimiant = Math.pow(b,2) - (4 * a * c)

    if (discrimiant < 0){
        return "This equation does not have a real solution";}
    else if (discrimiant == 0){
        return (-b + Math.sqrt(discrimiant)) / (2 * a);}
    else{
        answers = {};
        answers["solution_one"] = (-b + Math.sqrt(discrimiant)) / (2 * a);
        answers["solution_two"] = (-b - Math.sqrt(discrimiant)) / (2 * a);
        return answers;}
        
 }
 
