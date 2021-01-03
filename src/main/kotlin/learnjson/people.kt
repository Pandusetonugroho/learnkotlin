package learnjson

class people {
    var nama: String = ("")
    var usia: Int = 0
    var alamat: String = ("")

    constructor(nama: String, usia: Int, alamat: String) {
        this.nama = nama
        this.usia = usia
        this.alamat = alamat
    }


    constructor() {
        this.nama = ""
        this.usia = 0
        this.alamat = ""
    }

    fun display() {
        println(nama)
        println(usia)
        println(alamat)
    }
}