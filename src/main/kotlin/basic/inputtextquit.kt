package basic

fun main() {
    println("mau berapa kali")
    var bebasduastr = readLine()
    var bebasdua = bebasduastr!!.toInt()
    var a:Int = 0
    do{

        println("masukan angka")
        var bebas = readLine()
        println(bebas)
        a = a+1
    }while (a<bebasdua)


}