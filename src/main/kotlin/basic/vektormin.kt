package basic

fun kurang (vsatu:MutableList<Double>, vdua:MutableList<Double>): MutableList<Double> {
    var a:MutableList<Double> = mutableListOf()
    var x = vdua[0] - vsatu[0]
    var y = vdua[1] - vsatu[1]

    a.add(x)
    a.add(y)
    return a
}


fun main () {
    do {
        println("vektor satu")
        print("x1 = ")
        var a: String? = readLine()
        if (a != "quit") {
            var adbl = a!!.toDouble()
            print("y1 = ")
            var c: String? = readLine()
            var cdbl = c!!.toDouble()
            println("vektor dua")
            print("x2 = ")
            var b: String? = readLine()
            var bdbl = b!!.toDouble()
            print("y2 = ")
            var d: String? = readLine()
            var ddbl = d!!.toDouble()

            var vsatu:MutableList<Double> = mutableListOf(adbl, cdbl)
            var vdua:MutableList<Double> = mutableListOf(bdbl, ddbl)

            var hitung = kurang(vsatu, vdua)
            println(hitung)
        }
    } while (a != "quit")
}