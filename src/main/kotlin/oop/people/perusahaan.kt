package oop.people

class perusahaan {
    var nama = ""
    var direktur = People()
    var sekretaris = People()
    var alamat = Alamat()
    var mobil = Mobil()

    constructor(nama:String, direktur:People, sekretaris:People, alamat: Alamat, mobil: Mobil){
        this.nama = nama
        this.direktur = direktur
        this.sekretaris = sekretaris
        this.alamat = alamat
        this.mobil = mobil
    }

    constructor() {
        this.nama = ""
        this.direktur = People()
        this.sekretaris = People()
        this.alamat = Alamat()
        this.mobil = Mobil()
    }


    constructor(nama:String) {
        this.nama = nama
        this.direktur = People()
        this.sekretaris = People()
        this.alamat = Alamat()
        this.mobil = Mobil()
    }


    fun display () {
        println(nama)
        this.direktur.display()
        this.sekretaris.display()
        this.alamat.display()
        this.mobil.display()

    }
}

fun main () {
    var mobilmama = Mobil("toyota", "avanza", "bensin", false)
    var alamatmama = Alamat("b2 no 19", 3, 21, "mekarsari", "cimanggis")
    var mama = People("sufia", alamatmama, mobilmama)

    var mobilsekretaris = Mobil("ford", "everest", "bensin", true)
    var alamatsekretaris = Alamat("jasindo", 1, 29, "mekarsari", "cimanggis")
    var sekretaris = People("kukuh", alamatsekretaris, mobilsekretaris)

    var alamatconfetti = Alamat("jasindo", 3, 8, "mekarsari", "cimanggis")
    var mobilconfetti = Mobil("toyota", "avanza", "bensin", false)

    var confetti = perusahaan("confetti",mama, sekretaris, alamatconfetti,mobilconfetti)


    confetti.display()

    var immobi = perusahaan("immobi")
    immobi.alamat=alamatconfetti
    immobi.direktur=mama
    immobi.mobil=mobilconfetti
    immobi.sekretaris=sekretaris

    immobi.display()
}





