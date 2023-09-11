import java.util.Scanner
fun main() {
    var mySquare : Shape
    var myCircle : Shape
    var myTriangle : Shape
    var myEquilateral : Shape

    mySquare = Square("Sir Square")
    myCircle = Circle("Count Circle")
    myTriangle = Triangle("Tyrant Triangle")
    myEquilateral = EquilateralTriangle("Equilateral, Esquire")

    val input = Scanner(System.`in`)

    print("Enter the Length of Sir Square: ")
    var squareLength : Double = input.nextDouble()
    print("Enter the Height of Sir Square: ")
    var squareHeight : Double = input.nextDouble()

    print("Enter the Radius of Count Circle: ")
    var circleRadius : Double = input.nextDouble()

    print("Enter the First Side Length of Tyrant Triangle: ")
    var triangleSideA : Double = input.nextDouble()
    print("Enter the Second Side Length of Tyrant Triangle: ")
    var triangleSideB : Double = input.nextDouble()
    print("Enter the Third Side Length of Tyrant Triangle: ")
    var triangleSideC : Double = input.nextDouble()

    print("Enter the Side Length of Equilateral, Esquire: ")
    var equilateralSides : Double = input.nextDouble()

    mySquare.setDimensions(squareLength, squareHeight)
    mySquare.printDimensions()
    mySquare.getArea()
    myCircle.setDimensions(circleRadius)
    myCircle.printDimensions()
    myCircle.getArea()
    myTriangle.setDimensions(triangleSideA, triangleSideB, triangleSideC)
    myTriangle.printDimensions()
    myTriangle.getArea()
    myEquilateral.setDimensions(equilateralSides)
    myEquilateral.printDimensions()
    myEquilateral.getArea()
}