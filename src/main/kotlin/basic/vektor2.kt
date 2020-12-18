package basic

fun rumuss (a:Double, b:Double): Double {
    var xsatu = a
    var xdua = b

    var m = b-a
    return m
}

fun rumusss (c:Double, d:Double): Double {
    var ysatu = c
    var ydua = d

    var n = d-c
    return n
}

fun buatvector(titik1:Array<Double>, titik2:Array<Double>):Array<Double>{
    var x=titik2[0]-titik1[0]
    var y=titik2[1]-titik1[1]
    var hasil= arrayOf(x,y)
    return hasil
}

fun main () {
    do {
        print("x1 = ")
        var a:String? = readLine()
        if (a != "quit") {
            var adbl = a!!.toDouble()
            print("x2 = ")
            var b: String? = readLine()
            var bdbl = b!!.toDouble()
            print("y1 = ")
            var c: String? = readLine()
            var cdbl = c!!.toDouble()
            print("y2 = ")
            var d: String? = readLine()
            var ddbl = d!!.toDouble()

            var titiksatu:Array<Double> = arrayOf(adbl, cdbl)
            var titikdua:Array<Double> = arrayOf(bdbl, ddbl)

            var v=buatvector(titiksatu, titikdua)

            var hasilx = (titikdua[0]) - (titiksatu[0])
            var hasily = (titikdua[1]) - (titiksatu[1])
            print("(")
            print(hasilx)
            print(", ")
            print(hasily)
            println(")")
            println(" ")
        }
    }while (a!="quit")




}