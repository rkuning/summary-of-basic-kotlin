package functionalProgramming

import java.util.*

//slice distinc dan chuncked

/**
 * slice()
 * digunakan untuk menyaring item dari posisi tertentu.
 */

/**
 * distinct()
 * digunakan untuk menyaring item yang sama, sehingga output adalah nilai yang unix atau tidak sama lagi
 */

/**
 * chunked()
 * digunakan untuk emmecah nilai string menjadi beberapa bagian kecil dalam bentuk array. memutuhkan nilai yang digunakna
 * sebagai jumlah indeks untuk pemisah
 *
 */

fun main() {
//    slice
    val total = listOf(1,2,3,4,5,6,7,8,9,10)
    val slice = total.slice(3..6) //indeks ke 3 sampai 6
    val slice2 = total.slice(3..6 step 2) //indeks ke 3 sampai 6 tapi jarak nilai selanjutnya bertambah 2 indeks bukan 1
    println(slice) //[4,5,6,7]
    println(slice2) //[4,6]
//    jika ingin menyaring nilai spesifik, bisa dengan cara sebagai berikut :
    val index = listOf(2,3,5,8)
    val slice3 = total.slice(index)
    println(slice3) // [3, 4, 6, 9] ingatt, index dimulai dari 0 yaa.

//    distinct
    val totalDist = listOf(1,2,3,4,5,7,4,2,5,1,4,1,3)
    val distinct = totalDist.distinct()
    println(distinct) //[1, 2, 3, 4, 5, 7]

//    distinct pada data collection
    val items = listOf(
        Item("1","Kotlin"),
        Item("2","is"),
        Item("3","awesome"),
        Item("3","great"),
        Item("3","powerfull"),
    )

    val distinctItems = items.distinctBy { it.key }
    println(distinctItems)
    distinctItems.forEach{
        println("${it.key} with value ${it.value}")
    }

    /**
    1 with value Kotlin
    2 with value is
    3 with value awesome
     */

//    distinctBy juga bisa digunakan untuk mengsortir jumlah length yang sama
    val text = listOf("a","b","cc","ddd","ff","ggg","iiii")
    val distinctLength = text.distinctBy{
        it.length
    }
    println(distinctLength) //[a, cc, ddd, iiii]

//    chunked
    val word = "DANANG"
    val chunked = word.chunked(3)
    println(chunked) //[dan, ang]

//    data hasil chunked bisa dimodifikasi sbb :
    val chunkedTransform = word.chunked(3) {
        it.toString().lowercase(Locale.getDefault())
    }
    println(chunkedTransform)
}

//distinct
data class Item(val key:String, val value:Any)