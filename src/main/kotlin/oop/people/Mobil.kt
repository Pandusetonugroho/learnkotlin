package oop.people

class Mobil {

        var merk = ""
        var tipe = ""
        var jenis = ""
        var fwd:Boolean = false

        constructor(merk:String, tipe:String, bahanbakar:String, fwd:Boolean){
            this.merk=merk
            this.tipe=tipe
            this.jenis=bahanbakar
            this.fwd=fwd

        }

        constructor(){
            this.merk = ""
            this.tipe = ""
            this.jenis = ""
            this.fwd = false


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
    var fortuner = Mobil("Toyota", "Fortuner", "Bensin", true)

    fortuner.display()

}