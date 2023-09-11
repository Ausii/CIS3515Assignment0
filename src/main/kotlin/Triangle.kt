open class Triangle(_name : String) : Shape(_name){
    private var sideA = 0.0
    private var sideB = 0.0
    private var sideC = 0.0
    fun setDimensions(_sideA : Double, _sideB : Double, _sideC : Double) {
        sideA = _sideA
        sideB = _sideB
        sideC = _sideC
    }
    override fun printDimensions() {
        println("$name has Sides with Lengths $sideA, $sideB, $sideC")
    }
    override fun getArea() {
        val area = kotlin.math.sqrt((sideA + sideB + sideC) * sideA * sideB * sideC / 2)
        println("$name has Area $area")
    }
}