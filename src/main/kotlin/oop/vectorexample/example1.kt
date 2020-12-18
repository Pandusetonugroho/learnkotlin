package oop.vectorexample

import oop.vektor.vektor

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