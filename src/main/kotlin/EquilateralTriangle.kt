class EquilateralTriangle(_name : String) : Triangle (_name){
    private var sides = 0.0
    fun setDimensions(_sides : Double) {
        sides = _sides
    }
    override fun printDimensions() {
        println("$name has Sides of Length $sides")
    }
    override fun getArea() {
        val area = kotlin.math.sqrt(3.0) / 4 * sides * sides
        println("$name has Area $area")
    }
}