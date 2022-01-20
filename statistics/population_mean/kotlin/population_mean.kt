/**
* Calculates mean of a list
* 
* @param population in List<Double>
* @return calculated value of the specified
*/

fun calculateMean(population : List<Double>) =
    population.sum() / population.size

fun main(args : Array<String>) {
    val population = listOf(1.0, 2.0, 4.0, 7.0, 8.0)
    val mean = calculateMean(population)
    println(mean)
}