package oop.people

class People {

    var nama = ""
    var alamat:Alamat = Alamat()
    var mobil:Mobil = Mobil()

    constructor(nama:String, alamat: Alamat, mobil: Mobil){
        this.nama = nama
        this.alamat = alamat
        this.mobil = mobil

    }

    constructor() {
        this.nama = ""
        this.alamat = Alamat()
        this.mobil = Mobil()

    }

    fun display () {
        println(this.nama)
        this.alamat.display()
        this.mobil.display()
    }

}

fun main () {
    var alamatpandu = Alamat("laguna", 3, 21, "mekarsari", "cimanggis")
    var mobilpandu = Mobil("bmw", "e30", "bensin", false)
    var people = People("pandu", alamatpandu, mobilpandu)

    people.display()

}