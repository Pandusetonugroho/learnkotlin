package basic

fun main () {
    var alkali = "alkali = Li, Na, K, Rb, Cs, dan Fr "
    var alkali_tanah = "alkali tanah = Be, Mg, Ca, Sr, Ba, dan Ra "
    var boron = "boron = B, Al, Ga, In, dan Tl "
    var karbon = "karbon = C, Si, Ge, Sn, dan Pb "
    var nitrogen = "nitrogen = N, P, As, Sb, dan Bi "
    var oksigen = "oksigen = O, S, Se, Te, dan Po"
    var halogen = "halogen = F, Cl, Br, I, dan At"
    var gas_mulia = "gas mulia = He, Ne, Ar, Kr, Xe, dan Rn"

    do {
        print("input golongan ")
        var a = readLine()!!
        if (a == "1") {
            println(alkali)
            println(" ")
        } else if (a == "2") {
            println(alkali_tanah)
            println(" ")
        } else if (a == "13") {
            println(boron)
            println(" ")
        } else if (a == "14") {
            println(karbon)
            println(" ")
        } else if (a == "15") {
            println(nitrogen)
            println(" ")
        } else if (a == "16") {
            println(oksigen)
            println(" ")
        } else if (a == "17") {
            println(halogen)
            println(" ")
        } else if (a == "18") {
            println(gas_mulia)
            println(" ")
        }
    } while (a != "quit")

}