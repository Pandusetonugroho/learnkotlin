package oop.makhlukhidup

import java.io.File

class Databasemakhlukhidup {

    var database:MutableMap<String, Makhlukhidup> = mutableMapOf()

    constructor() {}

    fun addmakhlukhidup (m:Makhlukhidup) {
        database[m.species] = m
    }

    fun removemakhlukhidup (m:Makhlukhidup) {
        database.remove(m.species)
    }

    fun getmakhlukhidup (species:String) :Makhlukhidup? {
        var mh = database[species]
        return mh
    }

    fun displayallmh () {
        for ((s,m) in this.database) {
            m.display()
        }
    }
}

fun main () {
    var dm: Databasemakhlukhidup = Databasemakhlukhidup()
    do {
        print("command = ")
        var a = readLine()
        if (a == "add makhluk hidup") {
            print("kingdom = ")
            var a = readLine()
            print("divisi / filum = ")
            var b = readLine()
            print("subdivisi / subfilum = ")
            var c = readLine()
            print("kelas = ")
            var d = readLine()
            print("ordo = ")
            var e = readLine()
            print("famili = ")
            var f = readLine()
            print("genus = ")
            var g = readLine()
            print("species = ")
            var h = readLine()

            var tes = Makhlukhidup(a!!, b!!, c!!, d!!, e!!, f!!, g!!, h!!)
            dm.addmakhlukhidup(tes)

            var fileName = "/data/pandu/learnkotlin/src/main/kotlin/oop/makhlukhidup/makhlukhidup.txt"
            var fileObject = File(fileName)
            fileObject.appendText(tes.getstring() + "\n")
        }

        if (a == "get makhluk hidup") {
            print("get = ")
            var tes = readLine()
            var coba = dm.getmakhlukhidup(tes!!)
            coba!!.display()
        }
        if (a == "remove") {
            print("remove = ")
            var tes = readLine()
            var coba = dm.getmakhlukhidup(tes!!)
            dm.removemakhlukhidup(coba!!)
            dm.displayallmh()
        }
        if (a == "display all") {
            dm.displayallmh()
        }
        if (a == "display text") {
            val file = File("/data/pandu/learnkotlin/src/main/kotlin/oop/makhlukhidup/makhlukhidup.txt")
            var bufferedReader = file.bufferedReader()
            var text = bufferedReader.readLines()
            for (line in text) {
                println(line)
            }
        }
    } while (a != "quit")
}