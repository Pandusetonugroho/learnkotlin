package basic

import kotlin.math.sqrt

fun panjang (v:MutableList<Double>): Double {
    var x = v[0] * v[0]
    var y = v[1] * v[1]
    var b = x + y
    var c = sqrt(b)

    return c
}


fun main () {
    do {
        print("x = ")
        var a: String? = readLine()
        if (a != "quit") {
            var adbl = a!!.toDouble()
            print("y = ")
            var b: String? = readLine()
            var bdbl = b!!.toDouble()

            var vsatu:MutableList<Double> = mutableListOf(adbl, bdbl)

            var akhir = panjang(vsatu)
            println(akhir)
        }
    } while (a != "quit")
}