package dataClassCollections

fun main() {

    val list = (1..1000000).toList()
    val list2 = (1..1000000).toList()
//    dengan cara eager evaluation. artinya, semua angka dari 1 sd 100000 akan di cek satu per satu. jadinya lama prosesnya
//    alurnya, semua data(1 sd 1000000) disaring jika hasil bagi 5 = 0.
//    kemudian, hasil hasil dari filter akan di kalikan 2. dan yang terakhir, baru di looping untuk ditampilkan datanya
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }


//    cara 2 dengan cara lazy evaluation. hanya mengevaluasi data atau angka yang diperlukan saja
//    kalo ini seketika data yang di filter, akan langsung diproses ke map & foreach
//    contoh misal ketemu hasil 1, tidak akan masuk ke map dan foreach, karena bukan termasuk data pada saringan filter
//    ketemu angka 5. nah angka 5 ini akan langsung masuk ke map untuk di kalikan 2, kemudian masuk ke foreach untuk langsung ditampilkan ke console.
//    jika data sudah tampil ke console, maka akan dilanjutkan ke angka/filter berikutnya sampai selesai
    list2.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

//  seed artinya nilai awal. dilanjut untuk function it + 2. artinya nilai selanjutnya adalah nilai sekarang ditambah dengan 2
    val sequenceNumber = generateSequence(2) { it + 2 }
//  n : 5 artinya jumlah deret angka yang ditampilkan. jika tidak di isi, maka akan infinite loop
    sequenceNumber.take(5).forEach { print("$it ") } // Output: 1 2 3 4 5

}

