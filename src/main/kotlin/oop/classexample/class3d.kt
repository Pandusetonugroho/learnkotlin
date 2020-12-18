package oop.classexample

import basic.vektor
import basic.vektor3d

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

    var v= vektor(1.0,2.0)

    var v3:vektor3d = createvektor(1.0,2.0,3.0)



}