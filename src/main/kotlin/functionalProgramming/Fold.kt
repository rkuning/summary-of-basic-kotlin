package functionalProgramming

//fold drop dan take

//fold : untuk melakukan perhitungan setiap nilai yang berada dalam collection tanpa harus di iterasi satu satu



fun main() {
//    fold
    val number = listOf(1,2,3)
    val fold = number.fold(1){ current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("fold result : $fold")

//    drop
    val listDrop = listOf(1,2,3,4,5,6,7)
    val drop = listDrop.drop(3)
    println("$drop drop")
    val dropLast = listDrop.dropLast(5)
    println(dropLast)

//    take
    val listTake = listOf(1,2,3,4,5,6,7)
    val take = listTake.take(3)
    println(take)
    val takeLast = listTake.takeLast(6)
    println(takeLast)
}
// penjelasan, nilai awal current adalah 10 sesuai dengan inisial awal fold
/**
 * item awal adalah nilai indeks ke 0 dari variabel number, yaitu 1
 * di akhir statement, current + item adalah nilai yang menjadi parameter dari current selanjutnya. yaitu 10 + 1. berarti
 * parameter current sekarang adalah 11. kemudian untuk itemnya adalah indeks ke 1 dari list number. yaitu 2
 * dan seterusnya
 *
 * fold ada 2 macam, yaitu fold dan foldRight
 * fold untuk inisiasi awal pada list numbernya dimulai dari indeks ke 0, sedangkan untuk foldRight
 * dimulai dari list palign akhir, codingannya sama
 */


//drop

/**
 * drop fungsinya untuk memangkas list
 * drop ada 2 macam, yaitu drop() dan dropLast()
 * drop() akan memangkas nilai dari inisiasinya kebawah, atau misal nilai drop(3), berarti memangkas 3 deret list pertama
 * dropLast() akan memangkas nilai selanjutnya dari parameter, misal dropLast(3), berarti memangkas 3 deret terakhir
 */

//take

/**
 * kebalikan dari drop, jika drop adalah menghapus.
 * kalau take adalah menampilkan data yang dari acuan parameter takenya.
 * take ada 2 macam, take() dan takeLast()
 * prinsipnya sama seperti drop.
 * jika take(3), jadi dia akan menampilkan 3 deret list pertama
 * jika takeLast(3), dia akan menampilkan 3 data deret list dari akhir
 */