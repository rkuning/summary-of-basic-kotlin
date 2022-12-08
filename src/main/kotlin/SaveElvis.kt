import com.dicoding.oop.utils.sayHello

fun main() {
    sayHello()
    val text: String? = null
    println(text?.length)

//    set default value / elvis Operator. default value dibawah ini adalah 7
    val textLength = text?.length ?: 0
//    sama dengan dibawah ini
//    val textLength = if (text != null) text.length else 7
    println(textLength)


//    pemaksaan ke kondisi tidak null, tidak disarankan karena jika nilai null maka compailer error terkena null pointer exception
    val textLength2 = text!!.length // ready to go ???
    println(textLength2)
}