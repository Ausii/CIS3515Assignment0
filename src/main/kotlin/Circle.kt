class Circle(_name : String) : Shape (_name){
    private var radius = 0.0
    fun setDimensions(_radius : Double) {
        radius = _radius
    }
    override fun printDimensions() {
        println("$name has Radius of Length $radius")
    }
    override fun getArea() {
        val area = radius * radius * kotlin.math.PI
        println("$name has Area $area")
    }
}