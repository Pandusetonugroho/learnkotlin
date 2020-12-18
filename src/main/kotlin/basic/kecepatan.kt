package basic

fun rumus (a:Double,b:Double):Double {
    var jarak:Double = a
    var waktu:Double = b
    var hasil = a/b
    return hasil
}

fun main () {
    do {
        print("masukan jarak ")
        var a:String? = readLine()
        var aDbl:Double = a!!.toDouble()
        print("masukan waktu ")
        var b:String? = readLine()
        var bDbl:Double = b!!.toDouble()
        var hasil = rumus(aDbl,bDbl)
        print("kecepatan = ")
        print(hasil)
        println("m/s")


    }while (hasil>0)

}