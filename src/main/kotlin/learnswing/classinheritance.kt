package learnswing
import learnjson.people
import javax.swing.*

class pegawai(nama: String, usia: Int, alamat: String, var namaperusahaan:String): people(nama, usia, alamat) {

    fun displayper () {
        display()
        println(namaperusahaan)
    }
}

fun main() {
var medi = pegawai("medi", 22, "jasindo", "confetti")
    medi.displayper()

}