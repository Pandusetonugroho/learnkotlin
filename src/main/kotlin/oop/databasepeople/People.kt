package oop.databasepeople

class People {
    var nama: String = ""
    var alamat: String = ""
    var noktp: Int = 0

    constructor(nama: String, alamat: String, noktp: Int) {
        this.nama = nama
        this.alamat = alamat
        this.noktp = noktp
    }

    constructor() {
        this.nama = ""
        this.alamat = ""
        this.noktp = 0
    }

    fun display() {
        println(nama)
        println(alamat)
        println(noktp)
    }
}
