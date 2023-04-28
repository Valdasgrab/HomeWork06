package lt.vgrabauskas.homework06

abstract class Shape (val sideOne: Int, val sideTwo: Int){
    var area: Int = 0

    open fun calculateArea() {
        area = (sideOne * sideTwo)
    }

    override fun toString(): String {
        return "Jusu figuros plotas $area kv. cm "
    }
}