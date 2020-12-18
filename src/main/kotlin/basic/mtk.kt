package basic
import kotlin.math.sqrt

fun rumus (a:Double, b:Double, c:Double):Double {
    var a:Double = b*b - (4*a*c)
    var x:Double = -b + sqrt(a) / 2*a
    return x
}

fun main () {
   do{
       print("a = ")
    var a:String? = readLine()
    var aDbl:Double = a!!.toDouble()
    print("b = ")
    var b:String? = readLine()
    var bDbl:Double = b!!.toDouble()
    print("c = ")
    var c:String? = readLine()
    var cDbl:Double = c!!.toDouble()

    var hasil = rumus(aDbl,bDbl,cDbl)
    println (hasil)

}while (hasil!=0.0)
}