// Aritmetic prograssion, a corresponds to the initial term, c is the common progression
package PA_kotlin

fun main(args: Array<Int>){
	val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
}

fun pa_n_term(a: Int, b: Int, c: Int) Int {
	return a + (c - 1) * b
} 

fun sum_of_terms(a: Int, b: Int, c: Int) Int {
	return ((c) * ((2 * a) + (c - 1) * d)) / 2
}