package oop.person

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