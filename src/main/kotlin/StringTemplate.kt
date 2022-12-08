fun main() {
//    cara lama pakai konkat atau (+)
    val name = "Kotlin"
    println("My name is " + name)

//    cara baru
    val name2 = "Kotlin"
    val old = 3
    println("My name is $name2, im $old years old")


//    kotlin bisa juga menyisipkan expression pada string template, contoh dibawah ini :
    val hour = 8
    println("Office ${if (hour > 7) "already close" else "is open"}")


}