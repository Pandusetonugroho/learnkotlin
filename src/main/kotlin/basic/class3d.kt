package basic

import kotlin.math.sqrt

class vektor3d {
    var x: Double = 0.0
    var y: Double = 0.0
    var z: Double = 0.0

    constructor(x: Double, y: Double, z: Double) {
        this.x = x
        this.y = y
        this.z = z
    }

    fun panjang(v: vektor3d): Double {
        var hasil = vektor3d(0.0, 0.0, 0.0)
        var x2 = this.x * this.x
        var y2 = this.y * this.y
        var z2 = this.z * this.z
        var p = sqrt(x2 + y2 + z2)
        return p
    }

    fun addvektor(v: vektor3d): vektor3d {
        var hasil = vektor3d(0.0, 0.0, 0.0)
        hasil.x = this.x + v.x
        hasil.y = this.y + v.y
        hasil.z = this.z + v.z
        return hasil
    }

    fun minvektor(v: vektor3d): vektor3d {
        var hasil = vektor3d(0.0, 0.0, 0.0)
        hasil.x = this.x - v.x
        hasil.y = this.y - v.y
        hasil.z = this.z - v.z
        return hasil
    }

    fun timesvektor(v: vektor3d): vektor3d {
        var hasil = vektor3d(0.0, 0.0, 0.0)
        hasil.x = this.x * v.x
        hasil.y = this.y * v.y
        hasil.z = this.z * v.z
        return hasil
    }


    fun printstring(): String {
        var s = ""
        s = s + "x:" + x + "y:" + y + "z:" + z
        return s
    }

    fun absolute(): vektor3d {
        var hasil = vektor3d(0.0, 0.0, 0.0)
        if (this.x < 0) {
            hasil.x = this.x * -1
        } else {
            hasil.x = this.x
        }
        if (this.y < 0) {
            hasil.y = this.y * -1
        } else {
            hasil.y = this.y
        }
        if (this.z < 0) {
            hasil.z = this.z * -1
        } else {
            hasil.z = this.z
        }
        return hasil
    }
}


fun createvektor (x:Double,y:Double,z:Double):vektor3d {
        var hasil:vektor3d = vektor3d(x,y,z)
        return hasil
    }



fun main () {
    var v1=vektor3d(-1.0, -3.0, 2.0)
    var v2=vektor3d(-3.0,4.0, 2.0)
    println(v1.printstring())
    println(v2.printstring())
    println(" ")

    var a=v1.addvektor(v2)
    println(a.printstring())

    println(" ")

    var h=v2.minvektor(v1)
    println(h.printstring())

    println(" ")

    var b=v1.timesvektor(v2)
    println(b.printstring())

    println(" ")

    var c = v1.absolute()
    var x = v2.absolute()
    println(c.printstring())
    println(x.printstring())

    var v=vektor(1.0,2.0)

    var v3:vektor3d = createvektor(1.0,2.0,3.0)



}

