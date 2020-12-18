package basic



fun rumus (v1:Double,v0:Double,t1:Double,t0:Double):Double {

    if (t1==t0) {
        return -1.0
    }else {
        var hasil:Double = (v1-v0) / (t1-t0)
        println(hasil)
        return hasil
    }
}

fun main () {
    do{
        print("kecepatan akhir ")
        var a:String? = readLine()
        var aDbl:Double = a!!.toDouble()
        print("kecepatan mula ")
        var b:String? = readLine()
        var bDbl:Double = b!!.toDouble()
        print("waktu akhir ")
        var c:String? = readLine()
        var cDbl:Double = c!!.toDouble()
        print("waktu mula ")
        var d:String? = readLine()
        var dDbl:Double = d!!.toDouble()
        var hasil = rumus(aDbl,bDbl,cDbl,dDbl)
        print("percepatan = ")
        print(hasil)
        println("m/s2")
    }while(aDbl > 0)





}