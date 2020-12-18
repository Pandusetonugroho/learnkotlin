package basic

fun konversimeterkefeet (a:Double):Double {
    var konversi:Double = a * 3.28084
    return konversi
}

fun main () {

    do{
        var a:String? = readLine()
        var aDbl:Double = a!!.toDouble()
        var hasil = konversimeterkefeet(aDbl)
        print(aDbl)
        print(" ")
        print("meter")
        print(" = ")
        print(hasil)
        print(" ")
        println("feet")

    }while (hasil>0)


}