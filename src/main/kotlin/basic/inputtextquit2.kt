package basic
fun xplusy (x:Int,y:Int):Int {
        println("x+y")
        var soal:Int = x+y
        return soal

}





fun inputkatadarikeyboard (y:String):String {
    println(y)
    var kata = readLine()
    return kata!!

}
fun main () {
    var f:Int = 5
    var h:Int = 10
    var jawaban = xplusy(f,h)
    println(jawaban)
    var a:String = "masukan kata"

    do{

        var tulis = inputkatadarikeyboard(a)


        println(tulis)
    }while (tulis!="quit")



}