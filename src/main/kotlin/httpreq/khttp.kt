package httpreq

class people {
    var nama = ""
    var umur = 0

    constructor(nama:String, umur:Int) {
        this.nama=nama
        this.umur=umur
    }

    override  fun toString():String{
        return this.umur.toString()
    }

}

fun main () {

    var kukuh = people("kukuh", 9)
    println(kukuh)

    val response = khttp.get(
        url = "https://detik.com/search/searchall",
        params = mapOf("query" to "transmart", "siteid" to "2"))

    println(response.statusCode)
    println("=========================================")
    println(response.text)
    println("========================================")

}