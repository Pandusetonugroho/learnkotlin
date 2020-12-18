package oop.personexample

import basic.createorang
import basic.tambahorang


fun main () {
    var widi = basic.orang("widi", 19, "sugianto", "bintari", 1)
    var pandu = basic.orang("pandu", 16, "sugianto", "bintari", 2)
    var kukuh = basic.orang("kukuh", 9, "sugianto", "bintari", 3)

    var db: basic.databaseorang = basic.databaseorang()
    var mama: basic.orang = db.createorg("mama", 45,"org","org",4)
    println(mama.nama)

    var widi1 = createorang("widi",19,"sugianto","bintari",5)
    var pandu1 = createorang("pandu",16,"sugianto","bintari",6)
    var kukuh1 = createorang("kukuh",9, "sugianto","bintari",7)

    var c:MutableMap<Int, basic.orang> = mutableMapOf()
    var a = c.size
    println(a)
    tambahorang(c,widi)
    tambahorang(c,pandu)
    tambahorang(c,kukuh)
    var h = c.size
    println(h)

}