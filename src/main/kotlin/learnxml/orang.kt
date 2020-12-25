package learnxml

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.*

import java.lang.StringBuilder




class orang {
    var nama: String = ("")
    var usia: Int = 0
    var alamat: String = ("")

    constructor(nama: String, usia: Int, alamat: String) {
        this.nama = nama
        this.usia = usia
        this.alamat = alamat
    }


    constructor() {
        this.nama = ""
        this.usia = 0
        this.alamat = ""
    }

    fun display() {
        println(nama)
        println(usia)
        println(alamat)
    }

}

@Throws(IOException::class)
fun inputStreamToString(`is`: InputStream?): String? {
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(InputStreamReader(`is`))
    while (br.readLine().also { line = it } != null) {
        sb.append(line)
    }
    br.close()
    return sb.toString()
}


fun main () {
    var widi = orang("pandu", 16, "laguna")
    var mapper = XmlMapper()
    var tes = mapper.writeValueAsString(widi)

    println("-------------------")
    println(tes)
    println("-------------------")

    var a = File("orang.xml")
    mapper.writeValue(a,widi)
}