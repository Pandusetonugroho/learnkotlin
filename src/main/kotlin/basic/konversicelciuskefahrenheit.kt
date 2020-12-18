package basic

fun konversicelciuskefahrenheit (a:Double):Double {
    var konversi:Double = (a*9/5) + 32
    return konversi
}

fun main () {

    do{
        var a:String? = readLine()
        var aDbl:Double = a!!.toDouble()
        var hasil = konversicelciuskefahrenheit(aDbl)
        print(aDbl)
        print(" ")
        print("celcius")
        print(" = ")
        print(hasil)
        print(" ")
        println("fahrenheit")

    }while (hasil>0)


}