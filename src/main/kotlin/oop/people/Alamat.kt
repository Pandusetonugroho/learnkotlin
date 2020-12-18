package oop.people

class Alamat {
    var norumah = ""
    var RT = 0
    var RW = 0
    var kelurahan = ""
    var kecamatan = ""

    constructor(no:String, RT:Int, RW:Int, kel:String, kec:String) {
        this.norumah=no
        this.RT=RT
        this.RW=RW
        this.kelurahan=kel
        this.kecamatan=kec

    }

    constructor() {
        this.norumah = ""
        this.RT = 0
        this.RW = 0
        this.kelurahan = ""
        this.kecamatan = ""

    }

    fun display () {
        println(norumah)
        println(RT)
        println(RW)
        println(kelurahan)
        println(kecamatan)

    }
}

fun main () {
    var rumah = Alamat("b2 no 19", 3, 21, "mekarsari", "cimanggis")

    rumah.display()
}