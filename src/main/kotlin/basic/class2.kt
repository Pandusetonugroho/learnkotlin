package basic

class person {
    var nama:String = ("")
    var alamat:String = ("")
    var sekolah:String = ("")
    var noktp:Int = 0

    constructor(a:String, b:String, c:String, d:Int){
        this.nama=a
        this.alamat=b
        this.sekolah=c
        this.noktp=d
    }


}

fun main () {
    var widi=person("widi", "laguna", "ui", 1)
    var pandu=person("pandu", "laguna", "tugib", 2)
    var kukuh=person("kukuh", "laguna", "semut-semut", 3)

    var database:MutableMap<Int, person> = mutableMapOf()
    database[widi.noktp]=widi
    database[pandu.noktp]=pandu
    database[kukuh.noktp]=kukuh



    do {
        print("no ktp = ")
        var a : String? = readLine()
        if(a!="quit") {
            var aint:Int = a!!.toInt()
            var orang=database[aint]!!
            println(orang.nama)
            println(orang.alamat)
            println(orang.sekolah)
            println(" ")

        }
    }while (a!="quit")



}