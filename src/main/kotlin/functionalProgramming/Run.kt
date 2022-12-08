package functionalProgramming

fun main() {

    val text = "Hello"
//    run
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("Result : $result")

//    kalo coba pakai let seeprti tadi
    val result2 = text.let {
        val from = it
        val to = it.replace("Hello", "kotlin")
        "replace text from $from to $to"
    }
    println(result2)

//    with
    val message = "Hello Kotlin!"
    with(message) {
        println("Value is $this")
        println("with length ${this.length}")
    }
    val result3 = with(message) {
        "Value is $this" +
        " with length ${this.length}"
    }
    println(result3)

//    apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin")

    println(builder.toString())

    val message2 = StringBuilder().apply {
        append("Hello")
        append("Kotlin")
    }

    println(message2)
}