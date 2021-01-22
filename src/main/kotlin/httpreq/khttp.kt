package httpreq


fun main () {

    val response = khttp.get(
        url = "https://detik.com/search/searchall",
        params = mapOf("query" to "transmart", "siteid" to "2"))

    println(response.statusCode)
    println("=========================================")
    println(response.text)
    println("========================================")

    val response1 = khttp.post(
        url = "http://httpbin.org/post",
        json = mapOf("key1" to "value1", "keyn" to "valuen"))

    println(response1.statusCode)
    println(response1.text)

}