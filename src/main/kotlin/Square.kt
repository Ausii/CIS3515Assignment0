class Square(_name : String) : Shape (_name){
    private var length = 0.0
    private var height = 0.0
    fun setDimensions(_length : Double, _height : Double) {
        length = _length
        height = _height
    }
    override fun printDimensions() {
        println("$name has Length $length and Height $height")
    }
    override fun getArea() {
        val area = length * height
        println("$name has Area $area")
    }
}