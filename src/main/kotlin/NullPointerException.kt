fun main() {
//    akan error, karena hasil tidak seharusnya nullable
//    val text: String = null // compile time error

    val text: String? = "pengertain" // nullable (boleh null)

//    val textLength = text.length
//    tidak boleh, karena ada kemungkinan nilai null.
//    solusinya dibawah ini, pakai exception

    var textLength : Int? = null
    if (text != null) { textLength = text.length}

    print(textLength)
}