package fileio

import java.io.File

fun main () {
    var fileName = "/data/pandu/learnkotlin/src/main/kotlin/oop/makhlukhidup/makhlukhidup.txt"
    var fileObject = File(fileName)
    var isNewFileCreated :Boolean = fileObject.createNewFile()
    if(isNewFileCreated){
        println("fileName is created successfully.")
    } else{
        println("fileName already exists.")
    }

}