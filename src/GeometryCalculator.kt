class GeometryCalculator {

    fun rectangleInfo(a: Double, b: Double){
        println("=== ПРЯМОУГОЛЬНИКИ ===")
        println("Прямоугольник $a x $b:")
        println("Периметр: ${(a+b)*2}")
        println("Площадь: ${a*b}")
    }

    fun triangleInfo(a: Double, b: Double,c: Double){
        println("=== ТРЕУГОЛЬНИКИ ===")
        println("Треугольник со сторонами $a x $b $c:")
        if ((a*a * b*b) == c*c){
            println("Это правильный трегольник")
        }
        else{
            println("Это фигня")
        }
        println("Периметр треугольника ${a+b+c}")

    }
    fun circleInfo(r: Double){
        println("=== ОКРУЖНОСТИ ===")
        println("Длина окружности ${2*3.14*r}")
        println("Площадь круга ${3.14*r*r}")

    }
}