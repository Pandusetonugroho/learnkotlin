package basic

fun main () {
    for (i in 1..10 step 2) {
        println(i)
    }
println("============================")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    var tes:MutableList<String> = mutableListOf("widi", "pandu", "kukuh")

    for (name in tes) {
        println(name)
    }
println("=================")
    var x:Int = 2
    var y:Int = 1
    when (x+y+y) {
        1,2 -> println("satu / dua")
        3 -> println("tiga")
        else -> println("gada")
    }

    while (x==2){
    }

}