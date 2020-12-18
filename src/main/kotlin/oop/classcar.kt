package oop

class car  {
    var merk = ""
    var jenis = ""
    var tipe = ""
    var fwd:Boolean = false

    constructor(merk:String, jenis:String, bahanbakar:String, fwd:Boolean){
        this.merk=merk
        this.jenis=jenis
        this.tipe=bahanbakar
        this.fwd=fwd

    }
fun display () {
    print("merk = ")
    println(merk)
    print("jenis = ")
    println(jenis)
    print("tipe = ")
    println(tipe)
    print("fwd = ")
    println(fwd)


}
fun offroad ():Boolean {
    if (fwd==true){
        return true
    }
    else{
        return false
    }


}

}

fun main () {
    var fortuner:car = car("toyota", "fortuner", "bensin", true)
    var avanza:car = car("toyota", "avanza", "bensin", false)
    var brio:car = car("honda", "brio", "bensin", false)
    var everest:car = car("ford", "everest", "diesel", true)

    fortuner.display()
    print("mobil ini bisa offroad = ")
    println(fortuner.offroad())
    println(" ")
    avanza.display()
    print("mobil ini bisa offroad = ")
    println(avanza.offroad())
    println(" ")
    brio.display()
    print("mobil ini bisa offroad = ")
    println(avanza.offroad())
    println(" ")
    everest.display()
    print("mobil ini bisa offroad = ")
    println(everest.offroad())
    println(" ")

}