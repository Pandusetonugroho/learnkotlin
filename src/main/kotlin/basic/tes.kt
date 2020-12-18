package basic
fun main () {
    var angka : MutableList<Int> = mutableListOf<Int>()
    var a:Int = 1
    do {
        angka.add(a)
        a = a + 1
    }while (a<101)
    var b = 1
    do {
        var angkaa = angka[b]
        println(angkaa)
        b = b + 2
    }while (b < 101)

}