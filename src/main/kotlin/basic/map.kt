package basic

fun nogolongan (): MutableMap<Int, String> {
    var golongan: MutableMap<Int, String> = mutableMapOf()
    golongan[1] = "alkali"
    golongan[2] = "alkali tanah"
    golongan[13] = "boron"
    golongan[14] = "karbon"
    golongan[15] = "nitrogen"
    golongan[16] = "oksigen"
    golongan[17] = "halogen"
    golongan[18] = "gas mulia"
    return golongan
}

fun nogolongandua (): MutableMap<Int, String> {
    var golonganunsur: MutableMap<Int, String> = mutableMapOf()
    golonganunsur[1] = "Li, Na, K, Rb, Cs, dan Fr "
    golonganunsur[2] = "Be, Mg, Ca, Sr, Ba, dan Ra "
    golonganunsur[13] = "B, Al, Ga, In, dan Tl "
    golonganunsur[14] = "C, Si, Ge, Sn, dan Pb "
    golonganunsur[15] = "N, P, As, Sb, dan Bi "
    golonganunsur[16] = "O, S, Se, Te, dan Po"
    golonganunsur[17] = "F, Cl, Br, I, dan At"
    golonganunsur[18] = "He, Ne, Ar, Kr, Xe, dan Rn"
    return golonganunsur
}

fun main () {
    var mapgolongandannama = nogolongan()
    var mapgolongandanunsur = nogolongandua()

    var tes:MutableMap<Int, String> = mutableMapOf()
    tes[1] = "pandu"
    tes[2] = "kukuh"


    do {
        print("golongan = ")
        var a: String? = readLine()
        if (a != "quit") {
            var aint = a!!.toInt()
            print(mapgolongandannama[aint])
            print(" = ")
            println(mapgolongandanunsur[aint])
            println(" ")
        }
    } while (a != "quit")

}
