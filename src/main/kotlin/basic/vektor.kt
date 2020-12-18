package basic
import kotlin.math.sqrt

fun main () {
    do {
        print("x = ")
        var a:String? = readLine()
        if (a != "quit") {
            var adbl = a!!.toDouble()
            print("y = ")
            var b: String? = readLine()
            var bdbl = b!!.toDouble()

            var angka:Array<Double> = arrayOf(adbl,bdbl)

            var l = (angka[0])*(angka[0]) + ((angka[1])*(angka[1]))
            var akhir = sqrt(l)

            println(akhir)
            println(" ")
        }
    }while (a!="quit")
}