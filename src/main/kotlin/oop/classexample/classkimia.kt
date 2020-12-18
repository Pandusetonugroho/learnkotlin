package oop.classexample

import basic.golongandatabase
import basic.kimia

fun main () {


    var goldb = golongandatabase()



    do {
        print("no golongan = ")
        var a : String? = readLine()
        if(a!="quit") {
            var aint:Int = a!!.toInt()
            var hasil=goldb.database[aint]!!
            println(hasil.namagolongan)
            println(hasil.isigolongan)
            println(" ")

        }
    }while (a!="quit")



}