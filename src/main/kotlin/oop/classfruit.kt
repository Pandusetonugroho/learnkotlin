package oop

class buah {
    var namabuah = ""
    var rasa = ""

    constructor(nama: String, rasa: String) {
        this.namabuah=nama
        this.rasa=rasa

    }
fun display() {
    print("nama = ")
    println(namabuah)
    print("rasa = ")
    println(rasa)
    println(" ")
}

}
fun main () {
    var apel:buah = buah("apel","manis")
    var mangga:buah = buah("mangga", "manis")
    var jeruk:buah = buah("jeruk", "asem")

    apel.display()
    mangga.display()
    jeruk.display()
}