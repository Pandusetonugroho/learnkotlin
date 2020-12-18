package fileio

import java.io.File

fun main () {
    var fileName = "/data/belajarkotlin/src/main/kotlin/fileio/abcd.txt"
    var fileObject = File(fileName)
    var isNewFileCreated :Boolean = fileObject.createNewFile()
    if(isNewFileCreated){
        println("fileName is created successfully.")
    } else{
        println("fileName already exists.")
    }

}