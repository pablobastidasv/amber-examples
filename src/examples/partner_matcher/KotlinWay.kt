package examples.partner_matcher

import kotlin.math.pow

interface Shape
class Square(val height: Int, val width: Int): Shape
class Circle(val radius: Double): Shape

fun calculateArea(shape: Shape): Double {
    return when (shape) {
        is Square -> (shape.height * shape.width).toDouble()
        is Circle -> Math.PI * shape.radius.pow(2)
        else -> 0.0
    }
}

fun main() {
    val square = Square(37, 13)
    val circle = Circle(25.0)

    println("The square area is: " + calculateArea(square))
    println("The circle area is: " + calculateArea(circle))
}
