package functionalProgramming

//contoh string builder, deklarasinya harus satu satu jika ingin menambahkan data string didalamnya
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    stringBuilder.append("Danang")
    return stringBuilder.toString()
}

fun main() {
    println(buildString())

    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)

    //lamda receiver this

    val buildStrings = StringBuilder().apply {
        append("Hello")
        append("Kotlin")
    }

//receiver argument it
    val text = "Hello"
//    default it
    text.let{
        val message = "$it Kotlin"
        println(message)
    }
//    diganti jadi value
    text.let{ value ->
        val message = "$value Kotlin"
        println(message)
    }

}

//cara DSL atau Domain Specific Languages

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun build(action: StringBuilder /* = java.lang.StringBuilder */.() -> Unit):String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}


