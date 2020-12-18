package basic

class orang {
    var nama:String = ("")
    var usia:Int = 0
    var namabpk:String = ("")
    var namaibu:String = ("")
    var noktp:Int = 0
    constructor(nama:String, usia:Int, namabapak:String, namaibu:String, noktp:Int) {
        this.nama=nama
        this.usia=usia
        this.namabpk=namabapak
        this.namaibu=namaibu
        this.noktp=noktp
    }
}

class databaseorang {
    var database:MutableMap<Int, orang> = mutableMapOf()



    constructor() {}


    fun createorg (nama:String, usia:Int, namabapak:String, namaibu:String, noktp:Int):orang {
        var hasil:orang = orang(nama,usia,namabapak,namaibu,noktp)
        return hasil
    }

    fun addorg (nama:String, usia:Int, namabapak:String, namaibu:String, noktp:Int) {
        var org=this.createorg(nama, usia, namabapak, namaibu, noktp)
        this.database[org.noktp]=org
    }

}

fun tambahorang (a:MutableMap<Int, orang>, b:orang) {
     a[b.noktp] = b
}

fun createorang (nama: String, usia: Int, namabapak: String, namaibu: String, noktp: Int):orang {
    var b:orang = orang(nama,usia,namabapak,namaibu,noktp)
    return b
}

fun main () {
    var widi = orang("widi", 19, "sugianto", "bintari", 1)
    var pandu = orang("pandu",16,"sugianto","bintari",2)
    var kukuh = orang("kukuh",9,"sugianto","bintari",3)

    var db:databaseorang = databaseorang()
    var mama:orang = db.createorg("mama", 45,"org","org",4)
    println(mama.nama)

    var widi1 = createorang("widi",19,"sugianto","bintari",5)
    var pandu1 = createorang("pandu",16,"sugianto","bintari",6)
    var kukuh1 = createorang("kukuh",9, "sugianto","bintari",7)

    var c:MutableMap<Int, orang> = mutableMapOf()
    var a = c.size
    println(a)
    tambahorang(c,widi)
    tambahorang(c,pandu)
    tambahorang(c,kukuh)
    var h = c.size
    println(h)
}