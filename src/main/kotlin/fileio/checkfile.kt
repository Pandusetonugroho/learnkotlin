package fileio

import java.io.File

fun main () {
    var filename:String = "/data/belajarkotlin/src/main/kotlin/fileio/abcd.txt"
    var fileObject:File = File(filename)
    var fileExists:Boolean = fileObject.exists()
    if(fileExists) {
        println("ada")
    }
    else {
        println("ga ada")
    }

}