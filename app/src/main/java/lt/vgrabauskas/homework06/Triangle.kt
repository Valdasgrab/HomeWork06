package lt.vgrabauskas.homework06

class Triangle(sideOne: Int, sideTwo: Int) : Shape(sideOne, sideTwo) {

    override fun calculateArea() {
        super.area = (sideOne * sideTwo) / 2
    }
}