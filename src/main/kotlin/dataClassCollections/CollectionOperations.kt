package dataClassCollections

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    filter berfungsi untuk mensortir array atau list dengan kriteria tertentu
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList) // evenList: [2, 4, 6, 8, 10]
//    filterNot berfungsi untuk sortir data yang bukan termasuk dalam kategori tertentu
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList) // notEvenList: [1, 3, 5, 7, 9]
//    map berfungsi untuk memodifikasi data hasil filter dengan kondisi baru
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5) // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
//    find berfungsi untuk mencari nilai pertama yang hasilnya sesuai
    val firstOddNumber = numberList.find { it % 2 == 1 }
    println(firstOddNumber) // firstOddNumber: 1
//    firstOrNull berfungsi untuk mencari data dengan hasil tertentu mulai data yang pertama
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println(firstOrNullNumber) // firstOrNullNumber: null
//    lastOrNull berfungsi untuk mencari data dengan hasil tertentu mulai data yang terakir
    val lastOrNullNumber = numberList.lastOrNull { it % 2 == 3 }
    println(lastOrNullNumber) // firstOrNullNumber: null
//    first mencari data yang sesuai dengan kriteria, dengan di ambil dari paling awal
    val moreThan10 = numberList.first { it > 8 }
    println(moreThan10) // Output: 9
//    last mencari data yang sesuai dengan kriteria, dengan mengambil data paling akhir
    val lastThan10 = numberList.last { it > 8 }
    println(lastThan10) // Output: 10
//    menjumlahkan isi array
    val total = numberList.sum()
    println(total) // Output: 55

    print(numberList.count()) // Output: 10
    print(numberList.count { it % 3 == 0 }) // Output: 3 (hitung jumlah data yang merupakan kelipatan dari 3)

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
//    sorted() berfungsi untuk mengurutkan abjad atau angka dari kecil ke besar
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort) // ascendingSort: [i, k, l, n, o, t]
//    sortedDescending() berfungsi mengurutkan abjad atau angka dari besar ke kecil
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort) // descendingSort: [t, o, n, l, k, i]

    val angka = listOf(1,3,45,2,7,8,4)
    val prinANgka= angka.filter { a -> a % 3 == 0 }
    println(prinANgka)

}
