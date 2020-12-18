package oop.databasepeople

class Databasepeople {
    var database:MutableMap<Int, People> = mutableMapOf()

    constructor() {
    }

    fun addpeople (p:People) {
        database[p.noktp] = p
    }

    fun removepeople (p:People) {
        database.remove(p.noktp)
    }

    fun getpeople (noktp:Int): People? {
        var org = database[noktp]
        return org
    }

    fun displayallpeople () {
        for ((nk,p) in this.database){
            p.display()
        }
    }
}

fun main () {
    var dp:Databasepeople = Databasepeople()
    dp.addpeople(People("widi", "laguna", 1))
    dp.addpeople(People("pandu", "laguna", 2))
    dp.addpeople(People("kukuh", "laguna", 3))

    dp.displayallpeople()

    var tes = 2

    var coba = dp.getpeople(tes)
    coba!!.display()

    dp.removepeople(coba)

    dp.displayallpeople()
}