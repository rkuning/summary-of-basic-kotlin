package functionalProgramming

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    println(fullName)

    val fullName2 = getFullName2(first = "Dicoding")
    print(fullName2)


}

//menambah default value
fun getFullName2(
    first: String = "Danang",
    middle: String = " Ipul ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}