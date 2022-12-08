package functionalProgramming


//    extension function
//    berfungsi untuk mendapatkan nilai pewarisan pada kelas newInt

/*
Extension Functions
Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type, kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.). Contohnya, seperti berikut:

fun Int.printInt() {
    print("value $this")
}
Bisa kita perhatikan, kelas Int pada kode di atas digunakan sebagai receiver type, sedangkan kata kunci this adalah receiver type yang bertindak sebagai objeknya. Nilai dari objek tersebut bisa digunakan di dalam extension yang sudah dibuat.

Untuk memanggil extension functions di atas, lakukan dengan cara seperti berikut:
 */
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}


fun main() {
    10.printInt()
    println(10.plusThree())
    println(10.slice)


}

//extension property
/*
Selanjutnya adalah extension properties. Seperti yang disebutkan di awal, Kotlin juga mendukung extension untuk menambah sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.

Deklarasinya pun sama seperti extension functions. Kita terlebih dahulu menentukan receiver type kemudian nama dari properti tersebut. Contoh seperti berikut:
 */
val Int.slice: Int
    get() = this / 2
