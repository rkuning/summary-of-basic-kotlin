fun main() {

    /*
    Selanjutnya adalah Array, yakni tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam sebuah variabel. Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size. Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut:
     */

    val array = arrayOf(1, 3, 5, 7)
    println(array)
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)
    for (arr in mixArray) print("$arr ")

    val intArray = intArrayOf(1, 3, 5, 7)
    println("")
    println(intArray[3])

    val intArray2 = Array(9, { i -> i * i }) // [0, 1, 4, 9...]

    for(arr in intArray2) {
        print("$arr ")
    }
}


/**
 * tipe data primitif array kotlin
 *
intArrayOf() : IntArray

booleanArrayOf() : BooleanArray

charArrayOf() : CharArray

longArrayOf() : LongArray

shortArrayOf() : ShortArray

byteArrayOf() : ByteArray


 */