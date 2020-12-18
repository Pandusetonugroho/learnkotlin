package basic

import kotlin.math.sqrt

class vektor{
    var x:Double = 0.0
    var y:Double = 0.0

    constructor(x:Double, y:Double){
        this.x=x
        this.y=y
    }

    fun panjang() {
        var x2=this.x*this.x
        var y2=this.y*this.y
        var p = sqrt(x2+y2)
    }

    fun addvektor(v:vektor):vektor{
        var hasil = vektor(0.0, 0.0)
        hasil.x=this.x+v.x
        hasil.y=this.y+v.y
        return hasil
    }

    fun minvektor(v:vektor):vektor{
        var hasil = vektor(0.0,0.0)
        hasil.x=this.x-v.x
        hasil.y=this.y-v.y
        return hasil
    }

    fun timesvektor(v:vektor):vektor {
        var hasil = vektor(0.0,0.0)
        hasil.x=this.x*v.x
        hasil.y=this.y*v.y
        return hasil
    }


    fun printstring(): String {
        var s = ""
        s=s + "x:" + x + "y:" + y
        return s
    }

    fun absolute():vektor {
        var hasil = vektor(0.0,0.0)
        if (this.x<0) {
            hasil.x=this.x*-1
        }else{
            hasil.x = this.x
        }
        if (this.y<0) {
            hasil.y=this.y*-1
        }else{
            hasil.y=this.y
        }
        return hasil
    }

    fun createvektor (x:Double,y:Double):vektor {
        var hasil:vektor = vektor(x,y)
        return hasil
    }

}

fun main () {
    var v1=vektor(-1.0, -3.0)
    var v2=vektor(-3.0,4.0)
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
    var g=v1.createvektor(2.0,6.8)
    println(g.printstring())

}