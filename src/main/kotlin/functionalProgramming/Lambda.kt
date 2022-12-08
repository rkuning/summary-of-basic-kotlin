package functionalProgramming

//lambda atau anonymous function
/*
Lambda expression, biasa disebut dengan anonymous function atau function literal adalah fitur yang cukup populer sampai sekarang dalam dunia functional programming. Bisa disebut sebagai anonymous karena lambda tidak memiliki sebuah nama seperti halnya sebuah fungsi pada umumnya. Karena merupakan sebuah fungsi, lambda juga dapat memiliki daftar parameter, body dan return type. Istilah lambda sendiri berasal dari istilah akademis lambda calculus yang digunakan untuk menggambarkan proses komputasi.
 */
//function declaration
val comparator = object :Runnable{
    override fun run() {
        // TODO:
    }
}

//anonymous function
val comparator2 = Runnable {
    // TODO:
}

// tanda am=nomymus function dibawah ini adalah ditandai dengan kurung kurawal
//pemanggialnnay pun mudah, hanya tinggal dipanggil variabelnya disusul dengan ()
val message = {name:String -> println("Hello $name From Lambda") }
val messageLength = { message: String -> message.length }

val pesan = { println("anjay bapak")}

fun main() {
    pesan()
    message("danang")
    val length = messageLength("Hello From lambda")
    println("Message length $length")

}
