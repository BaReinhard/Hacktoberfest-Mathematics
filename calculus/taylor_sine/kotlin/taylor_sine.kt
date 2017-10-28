/**
* Calculates sin(x) based on Taylor's series (http://math2.org/math/algebra/functions/sincos/expansions.htm)
* 
* @param: x a Double number in sin(x)
* @param: degree an Integer number to how accurate you want taylor sine value to be. 
The bigger the degree, the more accurate taylor sine value is.
* 
* @param: a Double variable of the specified value
*/
fun taylorSine(x : Double, degree : Int) : Double {
    var incre = x;
    var sum = x;

    for(i in 1..degree step 2) {
        val prod = (-x*x) / ((i+1)*(i+2))
        incre = incre * prod
        sum += incre
    }

    return sum;
}