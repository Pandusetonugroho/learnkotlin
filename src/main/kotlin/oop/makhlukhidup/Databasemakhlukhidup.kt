package oop.makhlukhidup

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


            var dm: Databasemakhlukhidup = Databasemakhlukhidup()
            dm.addmakhlukhidup(Makhlukhidup(a!!, b!!, c!!, d!!, e!!, f!!, g!!, h!!))
            dm.displayallmh()
        }

            if (a == "get makhluk hidup") {
                print("get = ")
                var dm: Databasemakhlukhidup = Databasemakhlukhidup()
                var tes = readLine()
                var coba = dm.getmakhlukhidup(tes!!)
                coba!!.display()
            }
            if (a=="remove") {
                print("remove = ")
                var dm: Databasemakhlukhidup = Databasemakhlukhidup()
                var tes = readLine()
                var coba = dm.getmakhlukhidup(tes!!)
                dm.removemakhlukhidup(coba!!)
                dm.displayallmh()
            }
        } while (a != "quit")
    }
