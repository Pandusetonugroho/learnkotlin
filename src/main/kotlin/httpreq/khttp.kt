package httpreq

fun main () {
    val response = khttp.get(
        url = "http://httpbin.org/get",
        headers = mapOf("header1" to "1", "header2" to "2"))

    print(response)
}