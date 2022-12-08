package functionalProgramming

fun main() {
    val text = "Hello"
    text.let{
        val msg = "$it Kotlin"
        println(msg)
    }
//    atau
    text.let{ value ->
        val msg = "$value Kotlin"
        println(msg)
    }

    val message : String? = null
    message?.let{
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

//    menguarngi penggunaan operator safe call
//    kode awal
    val message2 : String? = null
    val length2 = message2?.length ?: 0 * 2
    val text2 = "text length $length2"
    println(text2)

//    menjadi
    val message3 : String? = null
    message3?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run{
        val text = "Message is null"
        println(text)
    }

//    also
    val text1 = "Hello Kotlin"
    val result = text1.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")

}