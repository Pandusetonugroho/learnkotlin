package learnjson

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import oop.people.People

fun main () {
    var tes = jacksonObjectMapper()
    var kukuh = people("kukuh", 9, "laguna")
    var a = tes.writeValueAsString(kukuh)
    println(a)

    var b = people()
    var c:people = tes.readValue(a,people::class.java)
    c.display()
}