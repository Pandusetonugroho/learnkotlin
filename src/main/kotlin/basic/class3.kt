package basic

class kimia {
    var nogolongan:Int = 0
    var namagolongan:String = ("")
    var isigolongan:String = ("")
    var noktp:Int = 0

    constructor(no:Int, nama:String, isi:String){
        this.nogolongan=no
        this.namagolongan=nama
        this.isigolongan=isi

    }


}

class golongandatabase{
    var database:MutableMap<Int, kimia> = mutableMapOf()

    constructor(){
        var alkali=kimia(1, "alkali", "Li, Na, K, Rb, Cs, dan Fr")
        var alkalitanah=kimia(2, "alkali tanah", "Be, Mg, Ca, Sr, Ba, dan Ra")
        var boron=kimia(13, "boron", "B, Al, Ga, In, dan Tl")
        var karbon=kimia (14,"karbon","C, Si, Ge, Sn, dan Pb")
        var nitrogen=kimia (15,"nitrogen", "N, P, As, Sb, dan Bi")
        var oksigen=kimia (16,"oksigen","O, S, Se, Te, dan Po")
        var halogen=kimia (17,"halogen", "F, Cl, Br, I, dan At")
        var gasmulia=kimia (18,"gas mulia", "He, Ne, Ar, Kr, Xe, dan Rn")


        database[alkali.nogolongan]=alkali
        database[alkalitanah.nogolongan]=alkalitanah
        database[boron.nogolongan]=boron
        database[karbon.nogolongan]=karbon
        database[nitrogen.nogolongan]=nitrogen
        database[oksigen.nogolongan]=oksigen
        database[halogen.nogolongan]=halogen
        database[gasmulia.nogolongan]=gasmulia
    }
}

fun main () {


    var goldb = golongandatabase()



    do {
        print("no golongan = ")
        var a : String? = readLine()
        if(a!="quit") {
            var aint:Int = a!!.toInt()
            var hasil=goldb.database[aint]!!
            println(hasil.namagolongan)
            println(hasil.isigolongan)
            println(" ")

        }
    }while (a!="quit")



}