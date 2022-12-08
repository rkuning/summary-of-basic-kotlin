package generic

/*
Mendeklarasikan Fungsi Generic
Setelah deklarasi generic pada sebuah kelas, apa berikutnya? Kita akan belajar bagaimana mendeklarasikan generic pada sebuah fungsi. Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang berhubungan dengan List. Misalnya, list yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada tipe tertentu.

Fungsi generic memiliki tipe parameternya sendiri. Tipe argumen dari parameternya ditentukan ketika fungsi tersebut dipanggil. Cara mendeklarasikannya sedikit berbeda dengan kelas generic, Tipe parameter yang berada di dalam angle bracket harus ditempatkan sebelum nama dari fungsi yang kita tentukan. Sebagai contoh:
fun <T> run(): T {
    /*...*/
}
 */

//public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
//    /*...*/
//}


fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))
}
