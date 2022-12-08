package dataClassCollections

/*
List
Yang pertama adalah List. Dengan List kita dapat menyimpan banyak data menjadi satu objek. Sebagai contoh, kita bisa membuat sebuah List yang berisi sekumpulan data angka, karakter atau yang lainnya. Yang menarik, sebuah List tidak hanya bisa menyimpan data dengan tipe yang sama. Namun juga bisa berisi bermacam - macam tipe data seperti Int, String, Boolean atau yang lainnya. Cara penulisannya pun sangat mudah. Perhatikan saja beberapa contoh kode berikut.


 */
fun main() {
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    val numberList2 = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true, User("danang",1))
    println(numberList)
    println(numberList2)
    println(anyList[3])
    println(anyList[4])

//    mutable list
    val anyList2 = mutableListOf('a', "Kotlin", 3, true, User("bbb",1))
    anyList2.add('d') // menambah item di akhir list
    anyList2.add(1, "love") // menambah item pada indeks ke-1
    anyList2[3] = false // mengubah nilai item pada indeks ke-3
    anyList2.removeAt(0) // menghapus item pada indeks ke-0
    println(anyList2)
}