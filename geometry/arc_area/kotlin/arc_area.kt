/**
* Calculates the area of arc given by the angle of the arc
*
* @param radius the radius of the circle
* @param angle the angle of the arc in degree
* @return a Float value of the specified
*/

fun getArcArea(radius : Float, angle : Float) =
    (angle/360)*Math.PI*(radius*radius)

fun main(args : Array<String>) {
    val area = getArcArea(4.0f, 37.0f)
    println(area)
}