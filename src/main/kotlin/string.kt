fun main() {
val textString  = "Kotlin"
//    string dapat dilooping seperti array
    val text  = "Kotlin"
    val firstChar = text[0]

    for (char in text) {
        print("$char ")
    }
    println(' ')
    println("First character of $text is $firstChar")

//    escaped String
    /*
\t: menambah tab ke dalam teks.

\n: membuat baris baru di dalam teks.

\’: menambah karakter single quote kedalam teks.

\”: menambah karakter double quote kedalam teks.

\\: menambah karakter backslash kedalam teks.
     */
    val statement = "Kotlin is \"Awesome!\""
println(statement)

    val name = "Unicode test: \u00A9"
    println(name)

//    raw string
//    versi 1
    val line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"
println(line)

//    versi 2
    val line2 = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line2)

}
