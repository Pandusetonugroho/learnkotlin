package basic

fun main () {
    var namaanakmut: MutableList<String> = mutableListOf<String>()
    do {
        print("input nama ")
        var nama : String = readLine()!!

        if (nama!="-1") {
            namaanakmut.add(nama)
        }
    }while (nama!="-1")
    println(namaanakmut)

    var urutan = namaanakmut.size
    var a:Int = urutan-1

    do {
        var nama = namaanakmut[a]
        println(nama)
        a = a-1

    }while (a>= 0)



}