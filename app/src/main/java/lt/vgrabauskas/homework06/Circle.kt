package lt.vgrabauskas.homework06

import java.math.BigDecimal
import java.math.RoundingMode

class Circle(val circleLine: Int) : Shape(circleLine, circleLine) {
    val pi : Float = 3.14f
    var roundedValue = BigDecimal(0)

    override fun calculateArea() {
        val mass: Float = (circleLine * circleLine) * pi
        val decimal = BigDecimal("$mass")
        roundedValue = decimal.setScale(0, RoundingMode.UP)
    }

    override fun toString(): String {
        this.calculateArea()
        return "Jusu apskritimo plotas ${roundedValue} kv. cm "
    }
}