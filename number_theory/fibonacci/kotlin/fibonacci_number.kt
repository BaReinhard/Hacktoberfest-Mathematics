/**
* Calculates fibonacci number at index num
*
* @param num the index of fibonacci number
* @return a Long value of the specified number
*/
fun fib(num : Int) : Long {
    var n1 : Long = 0;
    var n2 : Long = 1;

    for(i in 1..num) {
        val temp = n1 + n2;
        n1 = n2;
        n2 = temp;
    }

    return n1;
}