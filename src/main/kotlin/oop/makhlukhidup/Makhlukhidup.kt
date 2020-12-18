package oop.makhlukhidup

class Makhlukhidup {
    var kingdom = ""
    var divisiofilum = ""
    var subdivisiosubfilum = ""
    var kelas = ""
    var ordo = ""
    var famili = ""
    var genus = ""
    var species = ""

    constructor(k:String, df:String, s:String, ke:String, o:String, f:String, g:String, sp:String) {
        this.kingdom=k
        this.divisiofilum=df
        this.subdivisiosubfilum=s
        this.kelas=ke
        this.ordo=o
        this.famili=f
        this.genus=g
        this.species=sp
    }

    constructor() {
        this.kingdom = ""
        this.divisiofilum = ""
        this.subdivisiosubfilum = ""
        this.kelas = ""
        this.ordo = ""
        this.famili = ""
        this.genus = ""
        this.species = ""
    }

    fun display () {
        println(kingdom)
        println(divisiofilum)
        println(subdivisiosubfilum)
        println(kelas)
        println(ordo)
        println(famili)
        println(genus)
        println(species)
    }

    fun getstring ():String {
        var a:String = kingdom + "->" + divisiofilum + "->" + subdivisiosubfilum + "->" + kelas + "->" + ordo + "->" + famili + "->" + genus + "->" + species
        return a
    }

}