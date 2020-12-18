package fileio

import java.io.File
fun main() {
    val fileName = "/data/pandu/learnkotlin/src/main/kotlin/fileio/abcd.txt"
    var fileObject = File(fileName)
    // create a new file
    fileObject.appendText("tes tes tes tes tes tes tes datbodatbo\n")
    fileObject.appendText("tdsfsdss")
    fileObject.appendText("fdhsufhsfhjhdstdsfsdss")
}