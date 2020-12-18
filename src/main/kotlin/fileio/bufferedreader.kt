package fileio

import java.io.File
fun main() {
    val file = File("/data/pandu/learnkotlin/src/main/kotlin/fileio/abcd.txt")
    var bufferedReader = file.bufferedReader()
    var text = bufferedReader.readLines()
    for(line in text){
        println(line)
    }


}

