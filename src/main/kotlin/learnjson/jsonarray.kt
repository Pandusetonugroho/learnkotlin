package learnjson

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun main() {
    var widi = people("widi", 19, "laguna")
    var pandu = people("pandu", 16, "laguna")
    var kukuh = people("kukuh", 9, "laguna")

    var all: MutableList<people> = mutableListOf()
    all.add(widi)
    all.add(pandu)
    all.add(kukuh)

    var test = jacksonObjectMapper()
    var a = test.writeValueAsString(all)
    println(a)
}