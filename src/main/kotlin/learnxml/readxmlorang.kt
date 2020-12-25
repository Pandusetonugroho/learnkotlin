package learnxml

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.*
import java.lang.StringBuilder

@Throws(IOException::class)
fun inputStreamToString(fis: InputStream): String? {
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(InputStreamReader(fis))
    while (br.readLine().also { line = it } != null) {
        sb.append(line)
    }
    br.close()
    return sb.toString()
}

fun main() {
    var a = File("orang.xml")
    var b = FileInputStream(a)
    var c = inputStreamToString(b)
    println(c)

    var mapper = XmlMapper()
    var widi=mapper.readValue(c, orang::class.java)
    widi.display()
}